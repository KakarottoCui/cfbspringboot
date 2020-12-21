package com.cfb.dao.impl;

import com.cfb.dao.PermissionDao;
import com.cfb.mapper.PermissionMapper;
import com.cfb.model.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cuifengbo on 2020/12/9.
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
