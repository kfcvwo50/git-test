package com.qge.proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/12 14:19
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class TimerInvocationHandler implements InvocationHandler {
    private Object target;
    public TimerInvocationHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long a = System.currentTimeMillis();
        Object returnValue = method.invoke(target, args);
        long b = System.currentTimeMillis();
        System.out.println(b - a);
        return returnValue;
    }
}
