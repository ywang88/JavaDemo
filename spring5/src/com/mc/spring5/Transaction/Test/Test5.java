package com.mc.spring5.Transaction.Test;

import com.mc.spring5.Transaction.Service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Author wangyi
 * Create 2020-10-27 22:34
 * ClassName Test5
 * Version 1.0
 */
//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:Transaction.xml")
public class Test5 {
    @Autowired
    private AccountService accountService;

    @Test
    public void test(){
        accountService.accountMony();
    }
}
