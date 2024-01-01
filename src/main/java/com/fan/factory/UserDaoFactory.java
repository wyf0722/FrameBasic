package com.fan.factory;

import com.fan.dao.UserDao;
import com.fan.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
