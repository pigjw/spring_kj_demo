package com.lsm.inject_attribute_p_namespace;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComputerTest {
    @Test
    public void testComputerTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("inject_attribute.xml");
        ComputerTest computerTest = context.getBean("computerTest", ComputerTest.class);
        System.out.println(computerTest);
    }
}
