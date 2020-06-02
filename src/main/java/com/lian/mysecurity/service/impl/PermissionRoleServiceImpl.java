package com.lian.mysecurity.service.impl;

import com.lian.mysecurity.model.PermissionRole;
import com.lian.mysecurity.service.PermissionRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/2 21:23
 */
@Service
public class PermissionRoleServiceImpl implements PermissionRoleService {

    @Autowired
    PermissionRoleService permissionRoleService;

    @Override
    public PermissionRole add(PermissionRole permissionRole) {
        return null;
    }

    @Override
    public PermissionRole update(PermissionRole permissionRole) {
        return null;
    }

    @Override
    public List<PermissionRole> list() {
        return null;
    }

    @Override
    public PermissionRole delete(Long id) {
        return null;
    }

    @Override
    public List<PermissionRole> findListByRoleId(Long roleId) {
        return null;
    }
}
