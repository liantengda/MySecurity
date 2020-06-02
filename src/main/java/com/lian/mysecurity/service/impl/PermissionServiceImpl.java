package com.lian.mysecurity.service.impl;

import com.lian.mysecurity.mapper.PermissionMapper;
import com.lian.mysecurity.model.Permission;
import com.lian.mysecurity.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/2 21:23
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    PermissionMapper permissionMapper;

    @Override
    public Permission add(Permission permission) {
        return null;
    }

    @Override
    public Permission update(Permission permission) {
        return null;
    }

    @Override
    public List<Permission> list() {
        return null;
    }

    @Override
    public Permission delete(Long id) {
        return null;
    }

    @Override
    public Permission findById(Long id) {
        return null;
    }
}
