package com.qge.reflect;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/6 14:48
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class Test {
    public static void main(String[] args) {
        SomeService someService = new SomeService();
        someService.doSome();
        String s1 = someService.doSome("樱木花道");
        System.out.println(s1);
        String s2 = someService.doSome("赤木晴子", 18);
        System.out.println(s2);
    }
}
