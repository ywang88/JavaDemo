package day11;

import java.lang.annotation.*;

/**
 * Author wangyi
 * Create 2020-09-23 23:55
 * ClassName TestInterface
 * Version 1.0
 */
public class TestInterface {
}

@Target(ElementType.FIELD)//这个注解是给其它类的属性做注解
@Retention(RetentionPolicy.RUNTIME)//定义注解的生命周期
@Documented
@interface TestAnn {
    public int id() default 0;//未定义值时，默认值为0

    public String name() default "没有值";//未定义值时，默认值为空字符串
}

class testn {
    @TestAnn(id = 5, name = "没有值")
    String name;
}