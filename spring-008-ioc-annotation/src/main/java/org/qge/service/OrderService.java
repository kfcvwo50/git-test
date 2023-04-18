package org.qge.service;

import org.qge.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/10 17:50
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
@Service("orderService")
public class OrderService {
    @Autowired
    @Qualifier("orderDaoImplForOracle")
    private OrderDao orderDao;

    public void generate(){
        orderDao.insert();
    }
}
