package com.fan.dao.impl;

import com.fan.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id, String name) {
        int i = 1 / 0;
        System.out.println("id = " + id);
        return "fan";
    }
}
