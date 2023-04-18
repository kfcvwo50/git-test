package com.qge.proxy.service;

import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/13 11:57
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class MethodInterceptor implements net.sf.cglib.proxy.MethodInterceptor {
    @Override
    public Object intercept(Object target, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long begin = System.currentTimeMillis();
        Object returnValue = methodProxy.invokeSuper(target,objects);
        long end = System.currentTimeMillis();
        System.out.println("耗时" + (end - begin) + "毫秒");
        return returnValue;
    }
}
