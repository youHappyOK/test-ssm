package com.lj.mapper;

import com.lj.model.User;
import org.mybatis.spring.annotation.MapperScan;

public interface UserMapper {
    public User getUserById(Integer id);
}
