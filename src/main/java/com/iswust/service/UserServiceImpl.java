package com.iswust.service;

import com.iswust.dao.UserDao;
import com.iswust.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        try {
            if (userDao.selectUserById(user.getId()).size() == 0) {
                return userDao.addUser(user);
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 2;
        }
    }

    @Override
    public int deleteUser(User user) {
        try {
            return userDao.deleteUser(user);
        } catch (Exception e) {
            return 2;
        }

    }

    @Override
    public List<User> selectUserById(int id) {
        try {
            return userDao.selectUserById(id);
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public int updateUser(User user) {
        try {
            return userDao.updateUser(user);
        } catch (Exception e) {
            return 2;
        }

    }
}
