package com.lsm.inject_attribute.inject_attribute_list_bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStu {
    @Test
    public void testStu(){
        ApplicationContext context = new ClassPathXmlApplicationContext("inject_attribute.xml");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);
    }
}
