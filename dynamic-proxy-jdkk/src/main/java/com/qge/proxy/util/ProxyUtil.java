package com.qge.proxy.util;

import com.qge.proxy.service.OrderService;
import com.qge.proxy.service.TimerInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/13 11:26
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class ProxyUtil {

    public static Object newProxyInstance(Object target){
        OrderService proxyObj = (OrderService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new TimerInvocationHandler(target));
        return proxyObj;
    }

}
