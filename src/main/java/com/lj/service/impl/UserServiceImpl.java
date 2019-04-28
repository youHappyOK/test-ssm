package com.lj.service.impl;

import com.lj.mapper.UserMapper;
import com.lj.model.User;
import com.lj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}
