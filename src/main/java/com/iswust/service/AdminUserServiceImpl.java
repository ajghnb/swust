package com.iswust.service;

import com.iswust.dao.AdminUserDao;
import com.iswust.model.AdminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserServiceImpl implements AdminUserService{

    @Autowired
    private AdminUserDao adminUserDao;

    @Override
    public List<AdminUser> selectAdminUserById(int id) {
        try {
            return adminUserDao.selectAdminUserById(id);
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public int updateAdminUser(AdminUser user) {
        try {
                return adminUserDao.updateAdminUser(user);
        } catch (Exception e) {
            return 2;
        }
    }

    @Override
    public int addAdminUser(AdminUser adminUser) {
        try {
            return adminUserDao.addAdminUser(adminUser);
        } catch (Exception e) {
            return 2;
        }

    }

    @Override
    public int deleteAdminUser(AdminUser adminUser) {
        try {
            return adminUserDao.deleteAdminUser(adminUser);
        } catch (Exception e) {
            return 2;
        }

    }


}
