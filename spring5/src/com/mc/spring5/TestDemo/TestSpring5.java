package com.mc.spring5.TestDemo;

import com.mc.spring5.Bean.Emp;
import com.mc.spring5.BeanLife.Orders;
import com.mc.spring5.Book;
import com.mc.spring5.CollectionType.Courese;
import com.mc.spring5.CollectionType.STu;
import com.mc.spring5.Order;
import com.mc.spring5.Service.UserService;
import com.mc.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author wangyi
 * Create 2020-10-14 22:09
 * ClassName Test
 * Version 1.0
 */
public class TestSpring5 {

    @Test
    public void testAdd() {
        //1、加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/mc/spring5/XML/spring.xml");
        //2、获取配置创建的对象
        User users = context.getBean("user", User.class);
        users.add();
    }


    @Test
    public void testBook() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/mc/spring5/XML/spring.xml");
        Book book = context.getBean("book", Book.class);
        Book book1 = context.getBean("book", Book.class);
        System.out.println("通过属性scope=\"prototype\"设置为多实例对象 ");
        System.out.println(book);
        System.out.println(book1);
        book.showInfo();

    }

    @Test
    public void testOrder() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/mc/spring5/XML/spring.xml");
        Order order = context.getBean("order", Order.class);
        order.showInfo();

    }

    @Test
    public void userService() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/mc/spring5/XML/ServiceDao.xml");
        UserService userservice = context.getBean("userservice", UserService.class);
        userservice.test();

    }

    @Test
    public void emp() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/mc/spring5/XML/Bean.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();

    }

    @Test
    public void stu() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/mc/spring5/XML/Conertiontype.xml");
        STu stu = context.getBean("stu", STu.class);
        stu.add();

    }

    @Test
    public void books() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/mc/spring5/XML/Conertiontype.xml");
        com.mc.spring5.CollectionType.Book book = context.getBean("book", com.mc.spring5.CollectionType.Book.class);
        book.add();

    }

    @Test
    public void facbean() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/mc/spring5/XML/FacBean.xml");
        Courese facbean = context.getBean("fac bean", Courese.class);
        System.out.println(facbean);

    }

    @Test
    public void beanfile() {
        /*ApplicationContext context =
                new ClassPathXmlApplicationContext("BeanFile.xml");*/
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/mc/spring5/XML/BeanFile.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步，获取创建的bean实例对象" + orders);
        System.out.println(orders);
        context.close();
    }

    @Test
    public void beanautowire() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/mc/spring5/XML/BeanAutowires.xml");
        com.mc.spring5.BeanAutowire.Emp emp1 = context.getBean("emp", com.mc.spring5.BeanAutowire.Emp.class);
        System.out.println(emp1);
    }
}
