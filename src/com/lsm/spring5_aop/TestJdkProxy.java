package com.lsm.spring5_aop;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class TestJdkProxy {

    @Test
    public void testJdkProxy(){
        Class<?>[] interfaces = PersonA.class.getInterfaces();
        PersonA personA = new PersonA();
        Person person = (Person)Proxy.newProxyInstance(PersonA.class.getClassLoader(), interfaces, new PersonProxy(personA));
        person.printName();
    }
}
