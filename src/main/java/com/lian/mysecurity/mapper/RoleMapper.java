package com.lian.mysecurity.mapper;

import com.lian.mysecurity.model.Role;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/2 22:05
 */
@Repository
public class RoleMapper {
    private static HashMap<Long,Role> roleTable = new HashMap<>();
    
    static {
        roleTable.put(1L,new Role(1L,"",System.currentTimeMillis()));
        roleTable.put(1L,new Role(1L,"",System.currentTimeMillis()));
        roleTable.put(1L,new Role(1L,"",System.currentTimeMillis()));
        roleTable.put(1L,new Role(1L,"",System.currentTimeMillis()));
        roleTable.put(1L,new Role(1L,"",System.currentTimeMillis()));
        roleTable.put(1L,new Role(1L,"",System.currentTimeMillis()));
    }
    /**
     * 新增角色
     * @param role
     * @return
     */
    public Role add(Role role){
        Role put = roleTable.put(role.getId(), role);
        return put;
    }

    /**
     * 修改角色
     * @param role
     * @return
     */
    public Role update(Role role){
        Role put = roleTable.put(role.getId(), role);
        return put;
    }

    /**
     * 查询角色列表
     * @return
     */
    public List<Role> list(){
        List<Role> collect = roleTable.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList());
        return collect;
    }

    /**
     * 删除角色
     * @param id
     * @return
     */
    public Role delete(Long id){
        Role remove = roleTable.remove(id);
        return remove;
    }
}
