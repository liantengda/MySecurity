package com.lian.mysecurity.service.impl;

import com.lian.mysecurity.mapper.RoleUserMapper;
import com.lian.mysecurity.model.RoleUser;
import com.lian.mysecurity.service.RoleUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/2 21:23
 */
@Service
public class RoleUserServiceImpl implements RoleUserService {

    @Autowired
    RoleUserMapper roleUserMapper;

    @Override
    public RoleUser add(RoleUser roleUser) {
        return null;
    }

    @Override
    public RoleUser update(RoleUser roleUser) {
        return null;
    }

    @Override
    public List<RoleUser> list() {
        return null;
    }

    @Override
    public RoleUser delete(Long id) {
        return null;
    }

    @Override
    public List<RoleUser> findListByUid(Long uid) {
        return null;
    }
}
