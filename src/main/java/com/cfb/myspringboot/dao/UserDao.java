package com.cfb.myspringboot.dao;

import com.cfb.myspringboot.model.User;

import java.util.List;

/**
 * Created by cfb on 2020/9/8.
 */
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAll();

    User selectByUsernamePass(String username, String password);

    User selectByUsername(String username);
}
