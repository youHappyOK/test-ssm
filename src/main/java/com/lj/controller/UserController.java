package com.lj.controller;

import com.lj.model.User;
import com.lj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public User getUser(Integer id) {
        System.out.println("查询user");
        return userService.getUserById(id);
    }
}
