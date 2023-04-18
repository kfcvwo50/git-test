package com.qge.spring.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/03/2023/3/31 14:20
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    public void insert(){
        logger.info("数据库正在保存用户信息");
    }

}
