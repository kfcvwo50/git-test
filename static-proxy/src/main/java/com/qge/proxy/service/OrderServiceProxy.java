package com.qge.proxy.service;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/11 14:15
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class OrderServiceProxy implements OrderService{

    private OrderService orderService;

    public OrderServiceProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void Generate() {
        long begin = System.currentTimeMillis();
        orderService.Generate();
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    @Override
    public void modify() {
        long begin = System.currentTimeMillis();
        orderService.modify();
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    @Override
    public void detail() {
        long begin = System.currentTimeMillis();
        orderService.detail();
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
