package com.fan.dao.impl;

import com.fan.dao.BookDao;

import java.util.*;

public class BookDaoImpl implements BookDao {
    // 延迟加载使用lazy_init， 此处查看效果需要注释xml配置中的service部分，因为service依赖dao
    public BookDaoImpl() {
        System.out.println("bookdao constructor");
    }
    private int connectionNum;
    private String databaseName;
    private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public BookDaoImpl(int connectionNum, String databaseName) {
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    void init() {
        System.out.println("bookdaoimpl init...");
    }

    void destroy() {
        System.out.println("bookdaoimpl destory...");
    }
    public void save() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("book dao save ..." + databaseName + " " + connectionNum);
        System.out.println("array : " + Arrays.toString(array));
        System.out.println("list : " + list);
        System.out.println("set : " + set);
        System.out.println("map : " + map);
        System.out.println("properties : " + properties);
        System.out.println("--------------------------------------------------------------------------");
    }
}
