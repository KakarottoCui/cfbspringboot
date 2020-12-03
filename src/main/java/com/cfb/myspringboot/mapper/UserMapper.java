package com.cfb.myspringboot.mapper;

import com.cfb.myspringboot.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("Select * from user")
    List<User> selectAll();

    @Select("Select * from user where username = #{username} and password = #{password}")
    User selectByUsernamePass(@Param("username") String username, @Param("password") String password);

    @Select("Select * from user where username = #{username}")
    User selectByUsername(@Param("username") String username);
}