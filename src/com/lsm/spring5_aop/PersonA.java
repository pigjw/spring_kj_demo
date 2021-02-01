package com.lsm.spring5_aop;

public class PersonA implements Person {
    @Override
    public void printName() {
        System.out.println("我是被代理类A");
    }
}
