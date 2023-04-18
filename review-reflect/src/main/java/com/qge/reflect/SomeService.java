package com.qge.reflect;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/6 14:46
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class SomeService {
    public void doSome(){
        System.out.println("void doSome()执行");
    }
    public String doSome(String s){
        System.out.println("String doSome(String s)执行");
        return s;
    }
    public String doSome(String s,int i){
        System.out.println("String doSome(String s,int i)执行");
        return s + i;
    }
}
