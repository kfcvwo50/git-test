package com.ssm.spring.dao;

import com.ssm.spring.pojo.Vip;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDao {
    private static final Logger user = LoggerFactory.getLogger(UserDao.class);

    public void userInsert() {
        user.info("user的insert.......");
    }
}
