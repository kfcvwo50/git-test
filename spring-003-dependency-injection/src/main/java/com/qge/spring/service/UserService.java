package com.qge.spring.service;

import com.qge.spring.dao.UserDao;
import com.qge.spring.dao.VipDao;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/03/2023/3/31 14:22
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class UserService {

    private UserDao userDao;
    private VipDao vipDao;
    public void setLalala(UserDao abc) {
        this.userDao = abc;
    }

    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    public void saveUser(){
        userDao.insert();
    }

    public void saveVip(){
        vipDao.insert();
    }
}
