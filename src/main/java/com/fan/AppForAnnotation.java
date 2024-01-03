package com.fan;

import com.fan.config.SpringConfig;
import com.fan.dao.AnnotationDao;
import com.fan.dao.impl.AnnotationDaoImpl;
import com.fan.service.AnnotationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class AppForAnnotation {
    public static void main(String[] args) {
        // 加载配置类初始化容器
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ctx.registerShutdownHook();
//        AnnotationDao annotationDao1 = (AnnotationDao) ctx.getBean("annotationDao");
//        AnnotationDao annotationDao2 = (AnnotationDao) ctx.getBean("annotationDao");
//        System.out.println(annotationDao1);
//        System.out.println(annotationDao2);
//        ctx.close();
        // 注意！！！非单例模式destroy方法不会执行

        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
