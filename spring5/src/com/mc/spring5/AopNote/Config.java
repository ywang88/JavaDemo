package com.mc.spring5.AopNote;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Author wangyi
 * Create 2020-10-21 23:39
 * ClassName Config
 * Version 1.0
 */
//完全注解方式实现AspectJ
@Configuration
@ComponentScan(value = {"com.mc.spring5"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Config {
}
