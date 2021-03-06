package com.iswust.service;

import com.iswust.model.User;

import java.util.List;

public interface UserService {
    public int addUser(User user);
    public int deleteUser(User user);
    public List<User> selectUserById(int id);
    public int updateUser(User user);
}
