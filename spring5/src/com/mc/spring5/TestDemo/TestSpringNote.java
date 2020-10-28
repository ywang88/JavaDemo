package com.mc.spring5.TestDemo;

import com.mc.spring5.BeanNote.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author wangyi
 * Create 2020-10-20 22:59
 * ClassName TestSpringNote
 * Version 1.0
 */
public class TestSpringNote {
    @Test
    public void userservice() {
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("com/mc/spring5/NoteXml/BeanNote.xml");

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com/mc/spring5/NoteXml/BeanNote.xml");

        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
      userService.add();
    }

}
