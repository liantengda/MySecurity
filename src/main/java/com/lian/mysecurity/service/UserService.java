package com.lian.mysecurity.service;

import com.lian.mysecurity.model.User;

import java.util.List;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/2 21:23
 */
public interface UserService {

    /**
     * 新增用户
     * @param user
     * @return
     */
    public User add(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    public User update(User user);

    /**
     * 查询用户列表
     * @return
     */
    public List<User> list();

    /**
     * 删除用户
     * @param id
     * @return
     */
    public User delete(Long id);
}
