package com.fan;

import com.fan.dao.AnnotationDao;
import com.fan.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("F:\\LearnByExamples\\FrameBasic\\src\\main\\resources\\applicationContext.xml"); // 必须使用绝对路径

        // 第三方bean
//        DataSource dataSource = (DataSource)ctx.getBean("dataSource");
//        System.out.println(dataSource);

        // 获取bean的几种方式
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
//        BookDao bookDao = ctx.getBean(BookDao.class); // 对应的bean只能有一个
//        bookDao.save();

        // 在配置文件中<context:component-scan base-package="com.fan.dao.impl"/>
//        AnnotationDao annotationDao = (AnnotationDao) ctx.getBean("annotationDao");
//        annotationDao.show();
    }
}
