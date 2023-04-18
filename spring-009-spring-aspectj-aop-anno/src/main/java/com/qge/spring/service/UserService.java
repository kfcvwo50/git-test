package com.qge.spring.service;

import org.springframework.stereotype.Service;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/13 15:03
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
@Service
public class UserService {

    public void login(){
        System.out.println("系统正在进行身份认证....");
    }

    public void logout(){
        System.out.println("退出系统....");
    }

}
