package com.mc.java8.Meth;

/*数字运算的函数式接口
 * @Author wangyi
 * @Date 23:48 2020/10/28
 * @Param
 * @return
 **/
@FunctionalInterface
public interface Myfun<T> {
    public Integer getnum(Integer num);
}
