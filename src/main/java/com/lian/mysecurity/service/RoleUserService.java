package com.lian.mysecurity.service;

import com.lian.mysecurity.model.RoleUser;

import java.util.List;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/2 21:23
 */
public interface RoleUserService {

    /**
     * 新增角色用户关联记录
     * @param roleUser
     * @return
     */
    public RoleUser add(RoleUser roleUser);

    /**
     * 修改角色用户关联记录
     * @param roleUser
     * @return
     */
    public RoleUser update(RoleUser roleUser);

    /**
     * 查询角色用户关联记录列表
     * @return
     */
    public List<RoleUser> list();

    /**
     * 删除角色用户关联记录
     * @param id
     * @return
     */
    public RoleUser delete(Long id);

    public List<RoleUser> findListByUid(Long uid);
}
