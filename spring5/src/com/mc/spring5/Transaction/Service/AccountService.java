package com.mc.spring5.Transaction.Service;


import com.mc.spring5.Transaction.Dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Author wangyi
 * Create 2020-10-26 21:16
 * ClassName UserService
 * Version 1.0
 */

@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    //转账的方法
    @Transactional(readOnly = false,timeout = -1,propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
    public void accountMony() {

      //  try {
            //第一步开启事务
            //第二步执行业务
            //lucy减少100
            accountDao.reducemoney();
            //模拟异常
            int i = 10 / 0;
            //mary增加100
            accountDao.addmoney();
            //第三步没有发生异常提交事务
      //  }catch (Exception e){
            //第四步，出现异常，事务回滚
     //   }

    }
}
