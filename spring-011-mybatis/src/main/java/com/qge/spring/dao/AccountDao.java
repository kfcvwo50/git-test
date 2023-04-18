package com.qge.spring.dao;

import com.qge.spring.pojo.Account;

import java.util.List;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/17 09:17
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */

public interface AccountDao {
    int insert(Account account);
    int update(Account account);
    int deleteByActno(String actno);
    Account selectByActno(String actno);
    List<Account> selectAll();
}
