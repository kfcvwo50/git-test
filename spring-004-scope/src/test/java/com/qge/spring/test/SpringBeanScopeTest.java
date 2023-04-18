package com.qge.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/3 16:28
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class SpringBeanScopeTest {
    @Test
    public void testBeanScope(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
        Object sb1 = applicationContext.getBean("sb");
        System.out.println(sb1);
        Object sb2 = applicationContext.getBean("sb");
        System.out.println(sb2);
        Object sb3 = applicationContext.getBean("sb");
        System.out.println(sb3);
    }
}
