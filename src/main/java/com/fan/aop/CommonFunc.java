package com.fan.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
@Aspect
public class CommonFunc {
    @Pointcut("execution(* com.fan.dao.impl.BookDaoImpl.findName(..))")
    private void pt() {
    }


    //    @Before("pt()")
    public void before(JoinPoint joinPoint) {
        System.out.println("before advice... ");
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
    }

    //    @After("pt()")
    public void after(JoinPoint joinPoint) {
        System.out.println("after advice... ");
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
    }

    //    @Around("pt()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 888; // 修改数据
        System.out.println("around before advice... ");
        Object obj = proceedingJoinPoint.proceed(args);
        System.out.println("around after advice... ");
        return obj;
    }


//    @AfterReturning(value = "pt()", returning = "ret")
    public void afterReturning(Object ret) {
        System.out.println("afterReturning advice..." + ret);
    }

    @AfterThrowing(value = "pt()", throwing = "t")
    public void afterThrowing(Throwable t) {
        System.out.println("afterThrowing advice..." + t);
    }
}
