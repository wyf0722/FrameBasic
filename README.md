# AOP 入门案例
定义通知类

定义切入点:依托一个不具有实际意义的方法，即无参数，无返回值，方法体无实体逻辑

绑定切入点与通知关系，并指定通知添加到原始连接点的具体执行位置

Spring管理通知类，并定义当前类为切片类

**com.fan.aop.CommonFunc**
```java
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
```