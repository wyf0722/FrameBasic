package com.fan.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {
    @Pointcut("execution(* com.fan.service.*Service.*(..))")
    private void servicePt() {}

    @Around("ProjectAdvice.servicePt()")
    public void runSpeed(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // 获取执行签名信息
        Signature signature = proceedingJoinPoint.getSignature();
        String declaringTypeName = signature.getDeclaringTypeName();
        String name = signature.getName();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            proceedingJoinPoint.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.printf("业务层接口%s的%s方法，执行万次的时间：%d ms\n", declaringTypeName, name, (end - start));
    }
}
