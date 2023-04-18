package com.ssm.spring.bean.service.impl;

import com.ssm.spring.bean.dao.impl.UserDaoImpl;
import com.ssm.spring.bean.dao.UserDao;
import com.ssm.spring.bean.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void insertUser() {
        dao.insert();
    }
}
