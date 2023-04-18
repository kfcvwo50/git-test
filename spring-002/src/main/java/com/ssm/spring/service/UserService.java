package com.ssm.spring.service;

import com.ssm.spring.dao.UserDao;
import com.ssm.spring.dao.VipDao;
import com.ssm.spring.pojo.User;

public class UserService {

    private UserDao userDao;
    private VipDao vipDao;

    public UserService(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    public void insertUser() {
        userDao.userInsert();
    }
    public void insertVip() {
        vipDao.vipInsert();
    }
}
