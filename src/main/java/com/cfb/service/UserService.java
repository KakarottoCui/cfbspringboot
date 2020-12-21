package com.cfb.service;

import com.github.pagehelper.PageInfo;
import com.cfb.model.User;

/**
 * Created by cuifengbo on 2020/12/9.
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
