package com.fan.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class CommonFunc {
//    @Pointcut("execution(void com.fan.dao.impl.BookDaoImpl.update())")
//    @Pointcut("execution(void com.fan.dao.BookDao.update())")
//    @Pointcut("execution(* com.fan.dao.impl.BookDaoImpl.update())")
//    @Pointcut("execution(* com.fan.dao.impl.BookDaoImpl.update(*))") // no 需要任意参数
//    @Pointcut("execution(* *..update())")
//    @Pointcut("execution(* *..u*(..))") // 匹配u开头的方法
    @Pointcut("execution(* *..*e(..))") // 匹配e结尾的方法
    private void pt() {
    }
    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
