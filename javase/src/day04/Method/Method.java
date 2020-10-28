package day04.Method;

/**
 * Author wangyi
 * Create 2020-09-16 22:56
 * ClassName Method
 * Version 1.0
 */
public class Method {
    /**
     * 用数组方式来传递可变个数的参数
     * 如果没有参数，就要定义一个空数组或null
     * @Author wangyi
     * @Date 23:08 2020/9/7
     * @Param [args]
     * @return void
     **/
    public void printIfo(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    /**
     *用java特有的...方式来传递可变个数的参数，这种参数在使用时与数组的使用方式相同
     * 如果没有参数可以不填
     * 这种...代表可以传递0到多个参数
     * 如果一个方法有多个形参，可变形参(...这种参数)一定要放在所有的参数最后
     * 例: public void printIfo1(int s,int d,String... args)
     * @Author wangyi
     * @Date 23:16 2020/9/7
     * @Param
     * @return
     **/
    public void printIfo1(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
