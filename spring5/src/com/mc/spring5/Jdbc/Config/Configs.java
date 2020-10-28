package com.mc.spring5.Jdbc.Config;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author wangyi
 * Create 2020-10-22 21:05
 * ClassName Configs
 * Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.mc.spring5")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Configs {

}
