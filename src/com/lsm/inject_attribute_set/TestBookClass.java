package com.lsm.inject_attribute_set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestBookClass {
    @Test
    public void testBookClass(){
        //1.配置对象
        ApplicationContext context = new ClassPathXmlApplicationContext("inject_attribute.xml");
        //2.得到对象
        BookTest bookTest = context.getBean("bookTest", BookTest.class);
        System.out.println(bookTest.toString());
    }
}
