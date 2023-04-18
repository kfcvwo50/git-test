package com.qge.spring.service.impl;

import com.qge.spring.dao.AccountDao;
import com.qge.spring.pojo.Account;
import com.qge.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/17 09:33
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao dao;

    @Override
    public int save(Account act) {
        return dao.insert(act);
    }

    @Override
    public int update(Account act) {
        return dao.update(act);
    }

    @Override
    public int deleteByActno(String actno) {
        return dao.deleteByActno(actno);
    }

    @Override
    public Account getByActno(String actno) {
        return dao.selectByActno(actno);
    }

    @Override
    public List<Account> getAll() {
        return dao.selectAll();
    }

    @Override
    public void transfer(String fromActno, String toActno, double money) {
        Account fromAct = dao.selectByActno(fromActno);
        if (fromAct.getBalance() < money){
            throw new RuntimeException("余额不足");
        }
        Account toAct = dao.selectByActno(toActno);
        fromAct.setBalance(fromAct.getBalance() - money);
        toAct.setBalance(toAct.getBalance() + money);
        int count = dao.update(fromAct);
        count += dao.update(toAct);
        if (count != 2){
            throw new RuntimeException("转账失败");
        }
    }
}
