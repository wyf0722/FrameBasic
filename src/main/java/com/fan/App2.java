package com.fan;

import com.fan.dao.BookDao;
import com.fan.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        // 3.获取IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 4.获取bean
//        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
//        System.out.println(bookDao1);
//        bookDao1.save();

    }
}
