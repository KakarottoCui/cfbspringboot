package com.cfb.myspringboot.dao;

import com.cfb.myspringboot.model.Permission;

import java.util.List;

/**
 * Created by cfb on 2020/9/8.
 */
public interface PermissionDao {
    List<Permission> selectPermissionIdByRoleId(int roleId);
}
