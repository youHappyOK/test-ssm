package com.lj.controller;


import com.lj.model.User;
import com.lj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String sayHello() {
        System.out.println("儿子来请求了。。");
        return "你是我儿子！";
    }


}
