package com.lian.mysecurity.service.impl;

import com.lian.mysecurity.mapper.RoleMapper;
import com.lian.mysecurity.model.Role;
import com.lian.mysecurity.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/2 21:23
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public Role add(Role role) {
        return null;
    }

    @Override
    public Role update(Role role) {
        return null;
    }

    @Override
    public List<Role> list() {
        return null;
    }

    @Override
    public Role delete(Long id) {
        return null;
    }

    @Override
    public Role findById(Long id) {
        return null;
    }
}
