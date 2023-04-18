package com.qge.proxy;

import com.qge.proxy.service.MethodInterceptor;
import com.qge.proxy.service.UserService;
import net.sf.cglib.proxy.Enhancer;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/13 11:49
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new MethodInterceptor());
        UserService userServiceProxy = (UserService) enhancer.create();
        boolean success = userServiceProxy.login("admin", "123");
        System.out.println(success ? "登陆成功" : "登陆失败");
        userServiceProxy.logout();
    }
}
