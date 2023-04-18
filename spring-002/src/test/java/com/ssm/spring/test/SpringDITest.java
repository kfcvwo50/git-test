package com.ssm.spring.test;

import com.ssm.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDITest {
    @Test
    public void testConstructor(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService bean = applicationContext.getBean("serviceBean", UserService.class);
        bean.insertUser();
        bean.insertVip();
    }
}
