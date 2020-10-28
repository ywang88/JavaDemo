package com.mc.spring5.Service;

import com.mc.spring5.Dao.UserDaoImpl;

/**
 * Author wangyi
 * Create 2020-10-15 22:33
 * ClassName UserService
 * Version 1.0
 */
public class UserService {

    private UserDaoImpl userDao;

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public void test() {
        System.out.println("UserService-------");
        userDao.UserUpdata();
    }
}
