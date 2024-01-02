package com.fan.dao.impl;

import com.fan.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
        System.out.println("userdao constructor...");
    }

    @Override
    public void save() {
        System.out.println("user dao save ...");
    }
}
