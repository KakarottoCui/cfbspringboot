package com.zb.dao;

import com.zb.model.Role;

import java.util.List;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public interface RoleDao {
    List<Role> selectRoleByUserId(int userId);
}
