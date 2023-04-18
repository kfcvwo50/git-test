package com.ssm.spring.bean.dao.impl;

import com.ssm.spring.bean.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDaoImpl implements UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    public void insert() {
        logger.info("insert.......");
    }
}
