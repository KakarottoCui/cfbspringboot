package com.cfb.myspringboot.dao.impl;

import com.cfb.myspringboot.dao.PermissionDao;
import com.cfb.myspringboot.mapper.PermissionMapper;
import com.cfb.myspringboot.model.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cfb on 2020/9/8.
 */
@Component
public class PermissionDaoImpl implements PermissionDao {
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> selectPermissionIdByRoleId(int roleId) {
        return permissionMapper.selectPermissionIdByRoleId(roleId);
    }
}
