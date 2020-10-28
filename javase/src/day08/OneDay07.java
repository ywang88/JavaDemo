package day08;

/**
 * 对象类型转换
 * Author wangyi
 * Create 2020-09-14 22:07
 * ClassName OneDay07
 * Version 1.0
 */
public class OneDay07 {
    public static void main(String[] args) {
//         int i=10;
//         long l=i;

//         long i=121;
//         int l= (int) i;

        //子类到父类的类型转换可以自动进行
//        Student student = new Student();
//        Person p = student;

        //父类到子类的类型转换必须通过造型(强制类型转换)实现
//        Person person = new Person();
//        Student student1 = (Student) person;

        //无继承关系的引用类型间的转换是非法的
//        OneDay07 oneDay07=new OneDay07();
//        Person person1=oneDay07;

        //Object是所有类的最高父类,从子类到父类可以自动转换
//        String s="hello";
//        Object o=s;
//        System.out.println(o);
        OneDay07 oneDay07 = new OneDay07();
//        oneDay07.method(new Person());
        oneDay07.method(new Student());


/*       1编写 Order类，有int型的 orderld， String型的 OrderName，相应的 getter和
        setter（）方法，两个参数的构造器，重写父类的 equals（）方法:
        public boolean  equals（ Object ob），并判断测试类中创建的两个对象是否相等*/
        Order order = new Order(1, "二");
        Order order1 = new Order(1, "二");
        System.out.println(order1.equals(order1));

      /*  2请根据以下代码自行定义能满足需要的 MyDate类在 MyDate类中覆盖
        equals方法，使其判断当两个 My Date类型对象的年月日都相同时，结果为
        true，否则为 false。 public boolean equals（Object o）*/
        MyDate myDate = new MyDate(2020, 12, 26);
        MyDate myDate1 = new MyDate(2020, 22, 26);
        System.out.println(myDate.equals(myDate1));
        System.out.println(myDate.toString());

/*
  基本数据类的包装类主要用于基本数据类型与字符串直接的转化如72-81行
*/
        //手动装箱
        Integer i = new Integer("222");
        //手动拆箱
        int i0 = i.intValue();
        System.out.println(i0);

        Boolean b = new Boolean("false").booleanValue();
        System.out.println(b);
        //自动装箱
        Integer i1 = 112;
        //自动拆箱
        int i2 = i1;

        //字符串转换成基本数据类型添加
        // 1、通过包装类的parsexxx(String s)静态方法
        //2、通过包装类的构造器 int i = new Integer("222")
        int s = Integer.parseInt("324");
        float f = Float.parseFloat("0.15");
        boolean b1 = Boolean.parseBoolean("false");

        //基本数据类型转换成字符串
        //1、调用字符串重载的valueOf()方法
        //2、通过 String intsTr=5+""
        String istr = String.valueOf(5);
        String fstr = String.valueOf(0.45);
        String bstr = String.valueOf(true);

        Chinese.country = "中国";
        Chinese chinese = new Chinese();
        chinese.age = 12;
        chinese.name = "张三";
        System.out.println(Chinese.country);
        Chinese.test();

        //想Chinese知道被new了多少对象
        Chinese chinese1 = new Chinese();
        Chinese chinese2 = new Chinese();
        Chinese chinese3 = new Chinese();
        Chinese chinese4 = new Chinese();
        Chinese chinese5 = new Chinese();
        Chinese chinese6 = new Chinese();
        Chinese.showCount();
        //使用工具类判断传入的字符在是不是为空或null
        String s1 = null;
        System.out.println(Utils.isEmpt(s1));

    /*  饿汉式单例
        不能直接new私有的Single对象和类变量
        Single single=new Single();
        Single.single;*/
        //通过Single类的getInstance来调用，调用多次只会创建一个new对象
        Single single = Single.getInstance();
        Single single1 = Single.getInstance();
        Single single2 = Single.getInstance();
    }


    public void method(Person e) {
        //根据36-38行判断e是不是Studen类的对象,如果是就转换类型再输出Student的getSchool方法，如果不是直接输出
        if (e instanceof Student) {
            Student s = (Student) e;
            s.getSchool();
        } else {
            e.test();
        }
    }
}
