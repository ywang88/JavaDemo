package day11;

/**
 * Author wangyi
 * Create 2020-09-23 22:44
 * ClassName Test
 * Version 1.0
 */
public class Test {
    public static void main(String[] args) {


        //在new A时指定泛型的类型为String
        A<String> a = new A<String>();
        //对象使用setKey(T key)方法，中key的形参就是String
        a.setKey("你好");
        //T key(),返回值就有new对象时确定返回值是String
        String s = a.getKey();
        System.out.println(s);


        //接口未指定泛型数据类型，new对象需要指定数据类型
        B1<String> b1 = new B1<String>();
        //接口已指定泛型数据类型的，new对象不需要指定数据类型
        B2 b2 = new B2();
    }
}

//泛型类<>内可以任意命名，一般使用大写
class A<K> {
    private K key;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}

//泛型接口
interface B<T> {
    T test(T t);
}

/*
 * 未传入泛型实参时，与泛型的定义相同，在声明类的时候，
 * 需将泛型的声明也一起加到类中
 * @Author wangyi
 * @Date 22:59 2020/9/23
 * @Param
 * @return
 **/
class B1<T> implements B<T> {

    @Override
    public T test(T t) {
        return t;
    }
}

/*
 * 如果实现接口时指定接口的泛型具体数据类型
 * 这个类实现接口所有的方法的位置倒要泛型替换实际的具体数据类型
 * @Author wangyi
 * @Date 22:58 2020/9/23
 * @Param
 * @return
 **/
class B2 implements B<String> {

    @Override
    public String test(String s) {
        return s;
    }
}

//泛型方法
class C<C> {
    private C c;


    public static <T> void tse(T f) {
        //静态方法中，不能使用类定义的泛型，如果要是有泛型只能使用静态方法自己定义的泛型
        System.out.println(f);
//        System.out.println(this.c);
    }

    //无返回值泛型方法
    public <T> void test(T s) {
        System.out.println(this.c);
    }

    //有返回值泛型方法
    public <T> T test1(T s) {
        return s;
    }

    //可变参数类型的泛型方法
    public <T> void test2(T... strs) {
        for (T s : strs) {
            System.out.println(s);
        }
    }
}