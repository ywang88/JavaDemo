package com.mc.spring5.Transaction.Test;


import com.mc.spring5.Transaction.Service.AccountService;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author wangyi
 * Create 2020-10-26 21:28
 * ClassName TestAccount
 * Version 1.0
 */

public class TestAccount {



    @Test
    public void testMoney() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("jdbc.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.accountMony();
    }

//    @Test
//    public void testMoneys() {
//        ApplicationContext context = new
//                ClassPathXmlApplicationContext("Transaction.xml");
//        AccountService accountService = context.getBean("accountService", AccountService.class);
//        accountService.accountMony();
//    }
//
//    @Test
//    public void testMoneyss() {
//        ApplicationContext context = new
//                ClassPathXmlApplicationContext(String.valueOf(Txcofig.class));
//        AccountService accountService = context.getBean("accountService", AccountService.class);
//        accountService.accountMony();
//    }
}
