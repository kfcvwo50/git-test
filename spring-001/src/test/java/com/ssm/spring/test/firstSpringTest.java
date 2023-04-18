package com.ssm.spring.test;

import com.ssm.spring.bean.dao.impl.UserDaoImpl;
import com.ssm.spring.bean.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class firstSpringTest {
    @Test
    public void testFirstSpringCode(){
        //spring容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = ac.getBean("userBean", User.class);
        System.out.println(userBean);
    }
    @Test
    public void testSetDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserDaoImpl userDaoBean = applicationContext.getBean("userDaoBean", UserDaoImpl.class);
        userDaoBean.insert();
    }
}
