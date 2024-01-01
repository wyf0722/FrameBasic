package com.fan;

import com.fan.dao.UserDao;
import com.fan.factory.UserDaoFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) ctx.getBean("userDao");
        UserDao userDao2 = (UserDao) ctx.getBean("userDao");
        // 默认单例 UserFactoryBean重写方法进行控制
        System.out.println(userDao1);
        System.out.println(userDao2);
    }
}
