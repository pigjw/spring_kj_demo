package com.lsm.spring5_aop;

import org.junit.Test;
import org.springframework.lang.Nullable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//创建代理对象
public class PersonProxy implements InvocationHandler{
    private PersonA personA;

    public PersonProxy(@Nullable PersonA personA) {
        System.out.println("传进来的参数");
        this.personA = personA;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("增强前的方法");
        Object invoke = method.invoke(personA, args);
        System.out.println("增强后的方法");
        return invoke;

    }
}

