package com.iswust.service;

import com.iswust.model.AdminUser;

import java.util.List;

public interface AdminUserService {
    public List<AdminUser> selectAdminUserById(int id);
    public int updateAdminUser(AdminUser user);
    public int addAdminUser(AdminUser adminUser);
    public int deleteAdminUser(AdminUser adminUser);
}
