package com.lsm.inject_attribute_structor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonTest {
    @Test
    public void testPersonTest(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("inject_attribute.xml");
        PersonTest personTest = context.getBean("personTest", PersonTest.class);
        System.out.println(personTest);
    }
}
