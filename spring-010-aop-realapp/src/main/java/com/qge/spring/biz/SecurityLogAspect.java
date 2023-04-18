package com.qge.spring.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/14 09:57
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
@Aspect
@Component
public class SecurityLogAspect {
    @Pointcut("execution(* com.qge.spring.biz..save*(..))")
    public void savePointCut(){}
    @Pointcut("execution(* com.qge.spring.biz..delete*(..))")
    public void deletePointCut(){}
    @Pointcut("execution(* com.qge.spring.biz..update*(..))")
    public void updatePointCut(){}

    @Before("savePointCut() || deletePointCut() || updatePointCut()")
    public void beforeAdvice(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = sp.format(new Date());
        System.out.println(now + "恁爹" + "操作了" + signature.getName());
    }

}
