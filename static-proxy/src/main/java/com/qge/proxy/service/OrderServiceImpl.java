package com.qge.proxy.service;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/11 13:58
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */

public class OrderServiceImpl implements OrderService{
    @Override
    public void Generate() {
        try {
            Thread.sleep(1234);
            System.out.println("订单已生成");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void modify() {
        try {
            Thread.sleep(456);
            System.out.println("订单已修改");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void detail() {
        try {
            Thread.sleep(111);
            System.out.println("请查看订单");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
