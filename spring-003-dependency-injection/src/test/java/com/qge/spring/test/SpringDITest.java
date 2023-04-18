package com.qge.spring.test;

import com.qge.spring.bean.Jay;
import com.qge.spring.bean.Person;
import com.qge.spring.bean.User;
import com.qge.spring.jdbc.MyDataSource;
import com.qge.spring.service.CustomerService;
import com.qge.spring.service.OrderService;
import com.qge.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/03/2023/3/31 14:27
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class SpringDITest {

    @Test
    public void testSerDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userServiceBean = applicationContext.getBean("userServiceBean", UserService.class);
        //userServiceBean.saveUser();
        userServiceBean.saveVip();
    }

    @Test
    public void testConstructor(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService customerService = applicationContext.getBean("customerBean", CustomerService.class);
        customerService.save();
    }

    @Test
    public void testDoOrder(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        OrderService orderService = applicationContext.getBean("orderServiceBean", OrderService.class);
        orderService.generate();//外部bean
        OrderService orderService2 = applicationContext.getBean("orderServiceBean2", OrderService.class);
        orderService2.generate();//内部bean
    }

    @Test
    public void testUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(user);
    }

    @Test
    public void testDataSource(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        MyDataSource dataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(dataSource);
    }

    @Test
    public void testArray(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-array.xml");
        Jay jay = applicationContext.getBean("jay", Jay.class);
        System.out.println(jay);
    }

    @Test
    public void testList(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-collection.xml");
        Person person = applicationContext.getBean("personBean", Person.class);
        System.out.println(person);
    }

}
