package com.iswust.controller;

import com.iswust.model.User;
import com.iswust.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@ResponseBody
@RequestMapping(value = "/user", method = POST, produces = {APPLICATION_JSON_VALUE})
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser", method = POST)
    public int addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @RequestMapping(value = "/deleteUser", method = POST)
    public int deleteUser(@RequestBody User user) {
        return userService.deleteUser(user);
    }

    @RequestMapping(value = "/selectUserById", method = POST)
    public List<User> selectUserById(@RequestBody int id) {
        return userService.selectUserById(id);
    }

    @RequestMapping(value = "/updateUser", method = POST)
    public int updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

}
