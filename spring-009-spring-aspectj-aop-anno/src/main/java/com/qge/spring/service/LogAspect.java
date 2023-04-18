package com.qge.spring.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/13 15:05
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
@Component
@Aspect
@Order(1)
public class LogAspect {

    @Pointcut("execution(* com.qge.spring.service..*(..))")
    public void cutPoint(){

    }

    @Before("cutPoint()")
    public void better(JoinPoint joinPoint){//连接点
        System.out.println("前置通知....");
        Signature signature = joinPoint.getSignature();//目标方法的签名
        System.out.println("目标方法的方法名" + signature.getName());
    }

    @AfterReturning("cutPoint()")
    public void afterReturningAdvice(JoinPoint joinPoint){
        System.out.println("后置通知");
    }

    @Around("cutPoint()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("前环绕");
        joinPoint.proceed();
        System.out.println("后环绕");
    }

    @After("cutPoint()")
    public void afterAdvice(){
        System.out.println("最终环绕");
    }

    @AfterThrowing("cutPoint()")
    public void afterThrowingAdvice(){
        System.out.println("异常通知");
    }
}
