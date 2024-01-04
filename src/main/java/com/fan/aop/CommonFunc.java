package com.fan.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class CommonFunc {
    @Pointcut("execution(void com.fan.dao.BookDao.update())")
    private void pt() {

    }
    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
