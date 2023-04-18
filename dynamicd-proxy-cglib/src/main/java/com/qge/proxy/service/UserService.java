package com.qge.proxy.service;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/13 11:46
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class UserService {

    public boolean login(String username,String password){
        System.out.println("系统正在验证身份");
        if ("admin".equals(username) && "123".equals(password)){
            return true;
        }
        return false;
    }

    public void logout(){
        System.out.println("正在退出");
    }
}
