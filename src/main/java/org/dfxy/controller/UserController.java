package org.dfxy.controller;


import org.dfxy.mapper.UserMapper;
import org.dfxy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/test")
    public String test(Model model){
        return "test";
    }


    @GetMapping(value = "/test1")
    public List<User> test1(){
        System.out.println(userMapper.findAll());
        return userMapper.findAll();
    }

}
