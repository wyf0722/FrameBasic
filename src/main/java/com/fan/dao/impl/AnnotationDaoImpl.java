package com.fan.dao.impl;

import com.fan.dao.AnnotationDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("annotationDao")
@Scope("singleton") // 控制单例还是非单例
@Lazy
public class AnnotationDaoImpl implements AnnotationDao {
    @Value("${jdbc.driver}")
    private String name;

    @Override
    public void show() {
        System.out.println("注解Dao show() " + name);
    }
//    @PostConstruct
//    public void lifeInit() {
//        System.out.println("init...");
//    }
//    @PreDestroy
//    public void lifeDestroy() {
//        System.out.println("destroy...");
//    }
}
