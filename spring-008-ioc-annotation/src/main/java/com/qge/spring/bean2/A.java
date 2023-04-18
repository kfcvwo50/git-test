package com.qge.spring.bean2;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/10 16:08
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
@Service
public class A {
    public A() {
        System.out.println("a...........");
    }
}
@Controller
class B{
    public B() {
        System.out.println("b...........");
    }
}
@Component
class C{
    public C() {
        System.out.println("c...........");
    }
}
@Repository
class D{
    public D() {
        System.out.println("d...........");
    }
}
