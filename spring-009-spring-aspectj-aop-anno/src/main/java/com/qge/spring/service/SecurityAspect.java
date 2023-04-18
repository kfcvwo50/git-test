package com.qge.spring.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/13 17:25
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
@Aspect
@Component
@Order(2)
public class SecurityAspect {

    @Before("execution(* com.qge.spring.service..*(..))")
    public void beforeAdvice(){
        System.out.println("安全通知前置");
    }

}
