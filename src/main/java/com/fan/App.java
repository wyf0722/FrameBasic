package com.fan;

import com.fan.config.SpringConfig;
import com.fan.service.ResourceService;
import com.fan.service.impl.ResourceServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourceService resourceService = ctx.getBean(ResourceService.class);
        boolean flag = resourceService.openURL("http://pan.baidu.com/haha", "root122 ");
        System.out.println(flag);
    }
}
