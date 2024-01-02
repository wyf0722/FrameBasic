package com.fan;

import com.fan.dao.BookDao;
import com.fan.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        // 3.获取IOC容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 4.获取bean
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
        ctx.registerShutdownHook();
    }
}
