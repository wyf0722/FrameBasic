package com.fan.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class CommonFunc {
    @Pointcut("execution(void com.fan.dao.impl.BookDaoImpl.update())")
    private void pt() {
    }

    @Pointcut("execution(int com.fan.dao.impl.BookDaoImpl.select())")
    private void pt2() {
    }

//    @Before("pt()")
    public void before() {
        System.out.println("before advice... ");
    }

//    @After("pt()")
    public void after() {
        System.out.println("after advice... ");
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before advice... ");
        // 表示对原始方法的调用
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("around after advice... ");
        return obj;
    }

    @Around("pt2()")
    public Object around2(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before advice... ");
        // 表示对原始方法的调用
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("around after advice... ");
        return obj;
    }

    @AfterReturning("pt2()")
    public void afterReturning() {
        System.out.println("afterReturning advice...");
    }

    @AfterThrowing("pt2()")
    public void afterThrowing() {
        System.out.println("afterThrowing advice...");
    }
}
