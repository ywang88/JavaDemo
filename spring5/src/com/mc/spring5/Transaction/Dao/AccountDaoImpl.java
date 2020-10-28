package com.mc.spring5.Transaction.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Author wangyi
 * Create 2020-10-26 21:16
 * ClassName UserDaoImpl
 * Version 1.0
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addmoney() {
        String sql = "update  t_account set money=money+? where username=?";
        jdbcTemplate.update(sql, 100, "lucy");
    }

    @Override
    public void reducemoney() {
        String sql = "update  t_account set money=money-? where username=?";
        jdbcTemplate.update(sql, 100, "mary");
    }
}
