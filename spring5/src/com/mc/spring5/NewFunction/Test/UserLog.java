package com.mc.spring5.NewFunction.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;

/**
 * Author wangyi
 * Create 2020-10-27 21:46
 * ClassName UserLog
 * Version 1.0
 */
public class UserLog {
    private static final Logger log = LoggerFactory.getLogger(UserLog.class);
    @Nullable
    private String name;
    public static void main(String[] args) {
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }
}
