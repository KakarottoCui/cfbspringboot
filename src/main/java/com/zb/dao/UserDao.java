package com.zb.dao;

import com.zb.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by cuifengbo on 2020/12/9.
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
