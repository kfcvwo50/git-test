package com.qge.spring.bean;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/4 15:37
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class DateFactoryBean implements FactoryBean<Date> {

    public DateFactoryBean(String strDate) {
        this.strDate = strDate;
    }

    private String strDate;

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
        return sp.parse(strDate);
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
