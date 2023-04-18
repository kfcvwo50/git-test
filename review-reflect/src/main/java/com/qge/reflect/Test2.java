package com.qge.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/6 15:01
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class Test2 {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("com.qge.reflect.SomeService");
        Method doSome = clazz.getDeclaredMethod("doSome", String.class,int.class);
        Constructor<?> con = clazz.getDeclaredConstructor();
        Object obj = con.newInstance();
        Object retValue = doSome.invoke(obj, "杨颖",30);
        System.out.println(retValue);
    }
}
