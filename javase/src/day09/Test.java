package day09;

/**
 * Author wangyi
 * Create 2020-09-16 23:18
 * ClassName Test
 * Version 1.0
 */
public class Test {
    public static void main(String[] args) {
//        new Person();
//        new Person();

        //匿名内部类
        Person person = new Person() {
            //构建一个没有类名的Person的子类,也就是匿名的Person子类
            //内部类没有构造方法，只能通过代码块修改父类的初始值
            {
                super.name = "李四";
            }

            @Override
            public void test() {
                System.out.println("匿名内部类的的重写");
            }
        };
        System.out.println(person.name);
        person.test();

        Employee.CommonEmploye commonEmploye = new Employee.CommonEmploye();
        commonEmploye.work();
        commonEmploye.id=1;
        commonEmploye.name="李四";
        commonEmploye.salary=3245.34;
        commonEmploye.getCommonEmploye();


        Template.TestTmp testTmp=new Template.TestTmp();
        testTmp.getTime();
    }
}
