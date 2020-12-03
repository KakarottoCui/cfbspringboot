package com.cfb.myspringboot.dao;

import com.cfb.myspringboot.model.Role;

import java.util.List;

/**
 * Created by cfb on 2020/9/8.
 */
public interface RoleDao {
    List<Role> selectRoleByUserId(int userId);
}
