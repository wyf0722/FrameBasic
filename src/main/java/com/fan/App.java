package com.fan;

import com.fan.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("F:\\LearnByExamples\\FrameBasic\\src\\main\\resources\\applicationContext.xml"); // 必须使用绝对路径
        DataSource dataSource = (DataSource)ctx.getBean("dataSource");
        System.out.println(dataSource);
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
//        BookDao bookDao = ctx.getBean(BookDao.class); // 对应的bean只能有一个
//        bookDao.save();
    }
}
