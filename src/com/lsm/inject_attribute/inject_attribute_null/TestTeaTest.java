package com.lsm.inject_attribute.inject_attribute_null;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTeaTest {
    @Test
    public void testTeaTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("inject_attribute.xml");
        TeaTest teaTest = context.getBean("teaTest", TeaTest.class);
        System.out.println(teaTest.toString());
    }
}
