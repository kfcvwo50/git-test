package com.ssm.spring.dao;

import com.ssm.spring.pojo.Vip;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VipDao {
    private static final Logger vip = LoggerFactory.getLogger(VipDao.class);
    public void vipInsert() {
        vip.info("vip的insert.......");
    }

}
