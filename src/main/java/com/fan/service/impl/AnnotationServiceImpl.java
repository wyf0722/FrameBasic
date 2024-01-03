package com.fan.service.impl;

import com.fan.dao.AnnotationDao;
import com.fan.service.AnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class AnnotationServiceImpl implements AnnotationService {
    @Autowired
    @Qualifier("annotationDao")
    private AnnotationDao annotationDao;

    // 使用@Autowired可以删除set方法
//    public void setAnnotationDao(AnnotationDao annotationDao) {
//        this.annotationDao = annotationDao;
//    }

    @Override
    public void show() {
        System.out.println("注解服务 show()");
        annotationDao.show();
    }
}
