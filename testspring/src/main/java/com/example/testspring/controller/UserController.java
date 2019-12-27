package com.example.testspring.controller;
import com.alibaba.fastjson.JSON;
import com.example.testspring.entity.User;
import com.example.testspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="getUser/{id}",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public String GetUser(@PathVariable int id){
        User user=userService.Sel(id);
        return JSON.toJSONString(user);
    };

    @RequestMapping(value = "/register",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public User register(@RequestBody User userObj){
        userService.Register(userObj.getName(),userObj.getAge());
        return userObj;
    }
}
