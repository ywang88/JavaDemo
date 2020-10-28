package com.mc.spring5.AopNote;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Author wangyi
 * Create 2020-10-21 22:54
 * ClassName UserProxy
 * Version 1.0
 */
//增强的类
@Component
@Aspect
@Order(1)
public class UserProxy {

    //抽取相同切入点
    @Pointcut(value = "execution(* com.mc.spring5.AopNote.User.add(..))")
    public void pointdemo(){

    }
    //前置通知
    @Before(value = "pointdemo()")
    public void before() {
        System.out.println("before-----------------");
    }

    //后置通知
    @After(value = "execution(* com.mc.spring5.AopNote.User.add(..))")
    public void after() {
        System.out.println("after-----------------");
    }

    //返回结果后通知
    @AfterReturning(value = "execution(* com.mc.spring5.AopNote.User.add(..))")
    public void AfterReturning() {
        System.out.println("AfterReturning-----------------");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.mc.spring5.AopNote.User.add(..))")
    public void AfterThrowing() {
        System.out.println("AfterThrowing-----------------");
    }

    //环绕通知
    @Around(value = "execution(* com.mc.spring5.AopNote.User.add(..))")
    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前-----------------");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后-----------------");
    }


}
