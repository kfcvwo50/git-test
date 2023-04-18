package com.qge.reflect;

import java.lang.reflect.Method;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/6 16:23
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class Test3 {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("com.qge.reflect.User");
        String age = "age";
        String setMethodName = "set" + age.toUpperCase().charAt(0) + age.substring(1);
        Method setAge = clazz.getDeclaredMethod(setMethodName, int.class);
        Object o = clazz.newInstance();
        Object invoke = setAge.invoke(o, 70);
        System.out.println(invoke);
    }

}
