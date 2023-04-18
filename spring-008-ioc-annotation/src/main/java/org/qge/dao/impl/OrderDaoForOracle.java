package org.qge.dao.impl;

import org.qge.dao.OrderDao;
import org.springframework.stereotype.Repository;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/11 09:09
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
@Repository("orderDaoImplForOracle")
public class OrderDaoForOracle implements OrderDao {
    @Override
    public void insert() {
        System.out.println("Oracle数据库正在保存订单信息");
    }
}
