package com.example.testspring.mapper;

import com.example.testspring.entity.User;

import org.springframework.stereotype.Repository;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {
    User Sel(int id);
    User Register(String name,int age);
}
