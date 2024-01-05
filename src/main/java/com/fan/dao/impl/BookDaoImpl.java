package com.fan.dao.impl;

import com.fan.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    public void save() {
//        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save ...");
    }

    public void update() {
        System.out.println("book dao update ...");
    }

    public void delete() {
        System.out.println("book dao delete ...");
    }

    public int select() {
        System.out.println("book dao select ...");
//        int r = 1 / 0; // 抛异常 afterthrowing
        return 100;
    }
}
