package com.lsm.spring5_aop.aop_annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void testAop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5_aop_anno.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
