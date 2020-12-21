package com.cfb.dao;

import com.cfb.model.Permission;

import java.util.List;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public interface PermissionDao {
    List<Permission> selectPermissionIdByRoleId(int roleId);
}
