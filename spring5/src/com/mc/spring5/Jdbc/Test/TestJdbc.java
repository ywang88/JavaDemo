package com.mc.spring5.Jdbc.Test;

import com.mc.spring5.Jdbc.Dao.BookDao;
import com.mc.spring5.Jdbc.Service.BookService;
import com.mc.spring5.Jdbc.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Author wangyi
 * Create 2020-10-22 21:32
 * ClassName TestJdbc
 * Version 1.0
 */
public class TestJdbc {

    @Autowired
    private BookService bookService;

    @Test
    public void inster() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("jdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId(3);
        book.setUsername("雪中悍刀行");
        book.setUstatus("a");
        bookService.addbook(book);
    }

    @Test
    public void update() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("jdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId(4);
        book.setUsername("雪中悍刀行");
        book.setUstatus("a");
        bookService.updatebook(book);
    }

    @Test
    public void delete() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("jdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.deletebook(3);
    }

    @Test
    public void selectcount() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("jdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        int selectbook = bookService.selectbook();
        System.out.println(selectbook);
    }

    @Test
    public void selectone() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("jdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book selectone = bookService.selectone(1);
        System.out.println(selectone);
    }

    @Test
    public void selectall() throws Exception {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("jdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> selectlist = bookService.selectall();
        System.out.println(selectlist);
    }

    //数组批量新增
    @Test
    public void bachadd() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("jdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> bacts = new ArrayList<>();
        Object[] o1 = {4, "java", "1"};
        Object[] o2 = {5, "c++", "2"};
        Object[] o3 = {6, "php", "3"};
        bacts.add(o1);
        bacts.add(o2);
        bacts.add(o3);
        bookService.batchAdd(bacts);
        System.out.println(bacts);
    }

    @Test
    public void bachupdate() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("jdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> bacts = new ArrayList<>();
        Object[] o1 = {"javass", "1ss", 4};
        Object[] o2 = {"c++dd", "2dd", 5};
        Object[] o3 = {"phpdd", "3dd", 6};
        bacts.add(o1);
        bacts.add(o2);
        bacts.add(o3);
        bookService.batchupdate(bacts);
        System.out.println(bacts);
    }

    @Test
    public void bachdelete() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("jdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> bacts = new ArrayList<>();
        Object[] o1 = {4};
        Object[] o2 = {5};
        bacts.add(o1);
        bacts.add(o2);
        bookService.batchdelete(bacts);
        System.out.println(bacts);
    }
}
