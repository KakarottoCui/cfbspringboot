package com.cfb.myspringboot.service;

import com.github.pagehelper.PageInfo;
import com.cfb.myspringboot.model.User;

/**
 * Created by cfb on 2020/9/8.
 */
public interface UserService {
    User selectByPrimaryKey(Integer id);

    PageInfo<User> selectAll(int pageNum, int pageSize);

    User validateUser(String username, String password);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(User record);

    int updateByPrimaryKeySelective(User record);

    User selectByUsername(String username);

    User findRoleAndPermissions(User user);
}
