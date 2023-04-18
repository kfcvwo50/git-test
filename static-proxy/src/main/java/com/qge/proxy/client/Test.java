package com.qge.proxy.client;

import com.qge.proxy.service.OrderService;
import com.qge.proxy.service.OrderServiceImpl;
import com.qge.proxy.service.OrderServiceProxy;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/11 14:01
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class Test {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl();
        OrderService proxy = new OrderServiceProxy(orderService);
        proxy.Generate();
        proxy.modify();
        proxy.detail();
    }
}
