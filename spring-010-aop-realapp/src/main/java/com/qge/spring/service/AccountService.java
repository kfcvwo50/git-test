package com.qge.spring.service;

import org.springframework.stereotype.Service;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/13 17:57
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
@Service
public class AccountService {

    public void transfer(){
        System.out.println("银行账户正在完成转账操作...");
    }

    public void withdraw(){
        System.out.println("银行账户正在取款，请稍后...");
    }

}
