package com.lian.mysecurity.mapper;

import com.lian.mysecurity.model.PermissionRole;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/2 22:06
 */
@Repository
public class PermissionRoleMapper {
    private static HashMap<Long,PermissionRole> permissionRoleTable = new HashMap<>();

    static {
        permissionRoleTable.put(1L,new PermissionRole(1L,1L,1L,System.currentTimeMillis()));
        permissionRoleTable.put(1L,new PermissionRole(1L,1L,1L,System.currentTimeMillis()));
        permissionRoleTable.put(1L,new PermissionRole(1L,1L,1L,System.currentTimeMillis()));
        permissionRoleTable.put(1L,new PermissionRole(1L,1L,1L,System.currentTimeMillis()));
        permissionRoleTable.put(1L,new PermissionRole(1L,1L,1L,System.currentTimeMillis()));
        permissionRoleTable.put(1L,new PermissionRole(1L,1L,1L,System.currentTimeMillis()));
    }
    /**
     * 新增权限角色关联记录
     * @param permissionRole
     * @return
     */
    public PermissionRole add(PermissionRole permissionRole){
        PermissionRole put = permissionRoleTable.put(permissionRole.getId(), permissionRole);
        return put;
    }

    /**
     * 修改权限角色关联记录
     * @param permissionRole
     * @return
     */
    public PermissionRole update(PermissionRole permissionRole){
        PermissionRole put = permissionRoleTable.put(permissionRole.getId(), permissionRole);
        return put;
    }

    /**
     * 查询权限角色关联记录列表
     * @return
     */
    public List<PermissionRole> list(){
        List<PermissionRole> collect = permissionRoleTable.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList());
        return collect;
    }

    /**
     * 删除权限角色关联记录
     * @param id
     * @return
     */
    public PermissionRole delete(Long id){
        PermissionRole remove = permissionRoleTable.remove(id);
        return remove;
    }
}
