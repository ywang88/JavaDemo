package com.mc.java8.Meth;

/*计算的函数式接口
 * @Author wangyi
 * @Date 22:32 2020/10/28
 * @Param
 * @return
 **/
@FunctionalInterface
public interface MyfuntionJJCC<T, R> {
    public R getNum(T t1, T t2);
}
