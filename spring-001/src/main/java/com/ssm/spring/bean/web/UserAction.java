package com.ssm.spring.bean.web;

import com.ssm.spring.bean.service.impl.UserServiceImpl;

public class UserAction {
    private UserServiceImpl userService = new UserServiceImpl();
    public void insertRequest(){
        userService.insertUser();
    }
}
