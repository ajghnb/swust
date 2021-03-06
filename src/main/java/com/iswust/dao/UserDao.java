package com.iswust.dao;

import com.iswust.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {
    public int addUser(@Param("user") User user);
    public int deleteUser(@Param("user") User user);
    public List<User> selectUserById(@Param("id") int id);
    public int updateUser(@Param("user") User user);
}
