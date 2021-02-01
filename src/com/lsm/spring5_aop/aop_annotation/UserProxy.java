package com.lsm.spring5_aop.aop_annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强的类
@Component
@Aspect //这个注解表示生成这么一个代理对象
@Order(1)
public class UserProxy {
    //相同切入点提取
    @Pointcut(value = "execution(* com.lsm.spring5_aop.aop_annotation.User.add(..))")
    public void pointDemo(){

    }
    //前置通知 @Before注解作为前置通知
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before....");
    }

    @AfterReturning(value = "pointDemo()")
    public void afterReturning(){
        System.out.println("afterReturning....");
    }

    @AfterThrowing(value = "pointDemo()")
    public void afterThrowing(){
        System.out.println("afterThrowing....");
    }

    @Around(value = "pointDemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around之前....");
        proceedingJoinPoint.proceed();
        System.out.println("around之后....");

    }

    @After(value = "pointDemo()")
    public void after(){
        System.out.println("after....");
    }


}
