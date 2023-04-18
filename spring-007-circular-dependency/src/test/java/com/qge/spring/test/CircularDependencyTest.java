package com.qge.spring.test;

import com.qge.spring.bean.Husband;
import com.qge.spring.bean.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/6 09:47
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class CircularDependencyTest {
    @Test
    public void testCD(){
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring.xml");
        Husband husband = applicationContext.getBean("husbandBean", Husband.class);
        Wife wife = applicationContext.getBean("wifeBean", Wife.class);
        System.out.println(husband);
        System.out.println(wife);
    }
    @Test
    public void testCD2(){
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring2.xml");
        Husband husband = applicationContext.getBean("h", Husband.class);
        Wife wife = applicationContext.getBean("w", Wife.class);
        System.out.println(husband);
        System.out.println(wife);
    }
}
