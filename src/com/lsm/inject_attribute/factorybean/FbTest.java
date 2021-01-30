package com.lsm.inject_attribute.factorybean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FbTest {
    @Test
    public void fbTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("inject_attribute.xml");
        FbCourse fbCourse = context.getBean("fbBean", FbCourse.class);
        System.out.println(fbCourse);
    }
}
