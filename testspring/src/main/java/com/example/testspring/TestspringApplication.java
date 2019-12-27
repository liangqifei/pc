package com.example.testspring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.testspring.mapper")//扫描的mapper
@SpringBootApplication
public class TestspringApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestspringApplication.class, args);
    }
}





