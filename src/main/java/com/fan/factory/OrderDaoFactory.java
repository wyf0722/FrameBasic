package com.fan.factory;

import com.fan.dao.OrderDao;
import com.fan.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        System.out.println("factory setup ... ");
        return new OrderDaoImpl();
    }
}
