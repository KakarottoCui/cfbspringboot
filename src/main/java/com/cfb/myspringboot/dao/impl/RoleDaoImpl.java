package com.cfb.myspringboot.dao.impl;

import com.cfb.myspringboot.dao.RoleDao;
import com.cfb.myspringboot.mapper.RoleMapper;
import com.cfb.myspringboot.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cfb on 2020/9/8.
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
