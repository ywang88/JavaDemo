//package com.mc.spring5.Transaction.Config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
//
///**
// * 完全注解配置类
// * Author wangyi
// * Create 2020-10-26 23:26
// * ClassName Txcofig
// * Version 1.0
// */
//@Configuration//配置类
//@ComponentScan(basePackages = "com.mc")//组件扫描
//@EnableTransactionManagement//开启事务
//public class Txcofig {
//
//    //创建数据库连接池
//    @Bean
//    public DruidDataSource getDruidDataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://192.168.95.129/lear");
//        dataSource.setUsername("root");
//        dataSource.setPassword("wangyi123.");
//        return dataSource;
//    }
//
//    //创建jdbcTemplate
//    @Bean
//    public JdbcTemplate getjdbcTemplate(DataSource dataSource) {
//        //到ioc容器中根据类型找到dataSource
//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//        //注入dataSource
//        jdbcTemplate.setDataSource(dataSource);
//        return jdbcTemplate;
//    }
//
//    //创建事务管理器
//    @Bean
//    public DataSourceTransactionManager getTransactionManager(DataSource dataSource) {
//        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
//        transactionManager.setDataSource(dataSource);
//        return transactionManager;
//    }
//}
