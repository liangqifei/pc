package com.example.testspring.service;

import com.example.testspring.entity.User;
import com.example.testspring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
    public User Register(String name ,int age){
        return userMapper.Register(name,age);
    }
}
