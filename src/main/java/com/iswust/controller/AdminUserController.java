package com.iswust.controller;

import com.iswust.model.AdminUser;
import com.iswust.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@ResponseBody
@RequestMapping(value = "/adminUser", method = POST, produces = {APPLICATION_JSON_VALUE})
public class AdminUserController {

    @Autowired
    private AdminUserService adminUserService;

    @RequestMapping(value = "/updateAdminUser", method = POST)
    public int updateAdminUser(@RequestBody AdminUser adminUser) {
        return adminUserService.updateAdminUser(adminUser);
    }

    @RequestMapping(value = "/selectAdminUserById", method = POST)
    public List<AdminUser> selectAdminUserById(@RequestBody int id) {
        return adminUserService.selectAdminUserById(id);
    }

    @RequestMapping(value = "/addAdminUser", method = POST)
    public int addAdminUser(@RequestBody AdminUser adminUser) {
        return adminUserService.addAdminUser(adminUser);
    }

    @RequestMapping(value = "/deleteAdminUser", method = POST)
    public int deleteAdminUser(@RequestBody AdminUser adminUser) {
        return adminUserService.deleteAdminUser(adminUser);
    }
}
