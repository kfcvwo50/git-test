package com.qge.spring.biz;

import org.springframework.stereotype.Service;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/14 10:11
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
@Service
public class UserService {

    public void saveUser(){
        System.out.println("新增用户信息");
    }

    public void deleteUser(){
        System.out.println("删除用户信息");
    }

    public void updateUser(){
        System.out.println("修改用户信息");
    }

}
