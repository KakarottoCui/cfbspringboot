package com.cfb.dao.impl;

import com.cfb.dao.RoleDao;
import com.cfb.mapper.RoleMapper;
import com.cfb.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cuifengbo on 2020/12/9.
 */
@Component
public class RoleDaoImpl implements RoleDao {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> selectRoleByUserId(int userId) {
        return roleMapper.selectRoleByUserId(userId);
    }
}
