package com.lsm.inject_attribute.inject_attribute_inside_bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDeptEmp {
    @Test
    public void testDeptEmp(){
        ApplicationContext context = new ClassPathXmlApplicationContext("inject_attribute.xml");
        EmpTest empTest = context.getBean("empTest", EmpTest.class);
        System.out.println(empTest);
    }
}
