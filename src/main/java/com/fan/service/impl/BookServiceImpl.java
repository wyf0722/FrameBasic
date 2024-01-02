package com.fan.service.impl;

import com.fan.dao.BookDao;
import com.fan.dao.UserDao;
import com.fan.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    // 注意！！！ 5.删除业务层中使用new的方式创建的dao对象
    // private BookDao bookDao = new BookDaoImpl();
    private BookDao bookDao;
    private UserDao userDao;

//    public BookServiceImpl(BookDao rhs_bookDao, UserDao rhs_userDao) {
//        this.bookDao = rhs_bookDao;
//        this.userDao = rhs_userDao;
//    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }
    //6.提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init...");
    }
}
