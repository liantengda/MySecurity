package com.lian.mysecurity.common.security;


import com.lian.mysecurity.common.constants.RedisKeyConstant;
import com.lian.mysecurity.common.utils.JwtTokenUtil;
import com.lian.mysecurity.model.PermissionRole;
import com.lian.mysecurity.model.RoleUser;
import com.lian.mysecurity.service.PermissionRoleService;
import com.lian.mysecurity.service.PermissionService;
import com.lian.mysecurity.service.RoleService;
import com.lian.mysecurity.service.RoleUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;



@Component
@Slf4j
public class CustomRealm extends AuthorizingRealm {

    @Autowired
    RoleUserService roleUserService;
    @Autowired
    PermissionRoleService permissionRoleService;
    @Autowired
    PermissionService permissionService;
    @Autowired
    RoleService roleService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }

    /**
     * authentication 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)  {
        System.out.println("————身份认证方法————");
        String token = (String) authenticationToken.getCredentials();
        // 解密获得userId，用于和数据库进行对比
        Long userId = JwtTokenUtil.getId(token);
        if (userId == null || !JwtTokenUtil.verify(token)) {
            throw new AuthenticationException("token认证失败！");
        }
        //redis校验
        String key = stringRedisTemplate.opsForValue().get(RedisKeyConstant.TOKEN+userId);
        if (!StringUtils.equals(key,token)){
            throw new AuthenticationException("token认证失败！");
        }
        return new SimpleAuthenticationInfo(token, token, "MyRealm");
    }

    /**
     * authorization授权
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("————权限认证————");
        Long id = JwtTokenUtil.getId(principals.toString());
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //获得该用户角色
        List<RoleUser> roleList = roleUserService.findListByUid(id);
        Set<String> roleSet = new HashSet<>();
        roleList.stream().forEach(e -> roleSet.add(roleService.findById(e.getRoleId()).getRoleName()));
        //获取所有角色权限
        Set<String> permissionSet = new HashSet<>();
        for (int i = 0; i < roleList.size(); i++) {
            List<PermissionRole> roleMenuList = permissionRoleService.findListByRoleId(roleList.get(i).getRoleId());
            roleMenuList.stream().forEach(e -> permissionSet.add(permissionService.findById(e.getPId()).getName()));
        }
        //设置该用户拥有的角色和权限
        info.setRoles(roleSet);
        info.setStringPermissions(permissionSet);
        return info;
    }
}
