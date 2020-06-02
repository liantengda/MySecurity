package com.lian.mysecurity.mapper;

import com.lian.mysecurity.model.RoleUser;
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
public class RoleUserMapper {
    private static HashMap<Long,RoleUser> roleUserTable = new HashMap<>();

    static {
        roleUserTable.put(1L,new RoleUser(1L,1L,1L,System.currentTimeMillis()));
        roleUserTable.put(1L,new RoleUser(1L,1L,1L,System.currentTimeMillis()));
        roleUserTable.put(1L,new RoleUser(1L,1L,1L,System.currentTimeMillis()));
        roleUserTable.put(1L,new RoleUser(1L,1L,1L,System.currentTimeMillis()));
        roleUserTable.put(1L,new RoleUser(1L,1L,1L,System.currentTimeMillis()));
        roleUserTable.put(1L,new RoleUser(1L,1L,1L,System.currentTimeMillis()));
        roleUserTable.put(1L,new RoleUser(1L,1L,1L,System.currentTimeMillis()));
        roleUserTable.put(1L,new RoleUser(1L,1L,1L,System.currentTimeMillis()));
    }
    /**
     * 新增角色用户关联记录
     * @param roleUser
     * @return
     */
    public RoleUser add(RoleUser roleUser){
        RoleUser put = roleUserTable.put(roleUser.getId(), roleUser);
        return put;
    }

    /**
     * 修改角色用户关联记录
     * @param roleUser
     * @return
     */
    public RoleUser update(RoleUser roleUser){
        RoleUser put = roleUserTable.put(roleUser.getId(), roleUser);
        return put;
    }

    /**
     * 查询角色用户关联记录列表
     * @return
     */
    public List<RoleUser> list(){
        List<RoleUser> collect = roleUserTable.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList());
        return collect;
    }

    /**
     * 删除角色用户关联记录
     * @param id
     * @return
     */
    public RoleUser delete(Long id){
        RoleUser remove = roleUserTable.remove(id);
        return remove;
    }
}
