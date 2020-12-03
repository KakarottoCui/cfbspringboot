package com.cfb.myspringboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.cfb.myspringboot.dao.UserDao;
import com.cfb.myspringboot.dao.PermissionDao;
import com.cfb.myspringboot.dao.RoleDao;
import com.cfb.myspringboot.model.Permission;
import com.cfb.myspringboot.model.User;
import com.cfb.myspringboot.model.Role;
import com.cfb.myspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cfb on 2020/9/8.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private PermissionDao permissionDao;

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<User> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userDao.selectAll();
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }

    @Override
    public User validateUser(String username, String password) {
        return userDao.selectByUsernamePass(username, password);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(User record) {
        return userDao.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public User selectByUsername(String username) {
        return userDao.selectByUsername(username);
    }

    @Override
    public User findRoleAndPermissions(User user) {
        List<Role> roleList = roleDao.selectRoleByUserId(user.getId());
        user.setRoleList(roleList);

        List<Permission> permissions = new ArrayList<>();
        for (Role role: roleList) {
            List<Permission> permissionlist = permissionDao.selectPermissionIdByRoleId(role.getId());
            role.setPermissionList(permissionlist);
            permissions.addAll(permissionlist);
        }
        user.setPermissionList(permissions);
        return user;
    }
}
