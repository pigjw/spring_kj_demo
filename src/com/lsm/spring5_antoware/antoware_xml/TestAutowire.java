package com.lsm.spring5_antoware.antoware_xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
    @Test
    public void testAutowire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5_antoware.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp.getEmp());
    }
}
