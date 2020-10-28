package day09;

/**
 * Author wangyi
 * Create 2020-09-17 22:55
 * ClassName Employee
 * Version 1.0
 */
/*编写一个 Employee类，声明为抽象类，包含如下三个属性:name，id
        salary。提供必要的构造器和抽象方法:work（）。对于 Manager:类来说他既是员工，还具有奖金bous的属性。请使用继承的思想，设计
        Common employe类和 Manager类，要求类中提供必要的方法进行属
        性访问。*/
public abstract class Employee {
    int id;
    String name;
    double salary;

    public abstract void work();

    static class CommonEmploye extends Employee {
        public void setCommonEmploye(int id, String name, double salary) {
            super.id = id;
            super.name = name;
            super.salary = salary;
        }

        public void getCommonEmploye() {
            System.out.println("他的id是：" + super.id);
            System.out.println("他的姓名是：" + super.name);
            System.out.println("他的工资是：" + super.salary);
        }


        @Override
        public void work() {
            System.out.println("这是一个普通员工");
        }
    }

    class Manager extends Employee {
        double bous;

        public void setManager(int id, String name, double salary, double bous) {
            super.id = id;
            super.name = name;
            super.salary = salary;
            this.bous = bous;
        }

        public void getManager() {
            System.out.println("他的id是：" + super.id);
            System.out.println("他的姓名是：" + super.name);
            System.out.println("他的工资是：" + super.salary);
            System.out.println("他的奖金是：" + this.bous);

        }

        @Override
        public void work() {
            System.out.println("这是一个领导");
        }
    }
}
