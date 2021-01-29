package com.lsm.inject_attribute.inject_attribute_external_bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {

    @Test
    public void testUserService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("inject_attribute.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
