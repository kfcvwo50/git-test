package com.qge.spring.service;

import org.springframework.stereotype.Service;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/13 16:59
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
@Service
public class OrderService {

    public void generate(){
        System.out.println("生成订单");
        if(1 == 1){
            throw new RuntimeException("啦啦啦啦啦啦出错啦");
        }
    }

}
