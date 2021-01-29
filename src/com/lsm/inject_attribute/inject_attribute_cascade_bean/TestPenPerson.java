package com.lsm.inject_attribute.inject_attribute_cascade_bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPenPerson {
    @Test
    public void testPenPerson(){
        ApplicationContext context = new ClassPathXmlApplicationContext("inject_attribute.xml");
        PersonPenTest personPenTest = context.getBean("personPenTest", PersonPenTest.class);
        System.out.println(personPenTest);
    }
}
