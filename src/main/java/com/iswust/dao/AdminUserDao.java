package com.iswust.dao;

import com.iswust.model.AdminUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AdminUserDao {
    public List<AdminUser> selectAdminUserById(@Param("id")int id);
    public int updateAdminUser(@Param("user")AdminUser user);
    public int addAdminUser(@Param("user")AdminUser adminUser);
    public int deleteAdminUser(@Param("user") AdminUser adminUser);
}
