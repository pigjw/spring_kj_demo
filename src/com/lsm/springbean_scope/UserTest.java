package com.lsm.springbean_scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void userTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("springbean_scope.xml");
        UserTest userTest1 = context.getBean("userTest", UserTest.class);
        UserTest userTest2 = context.getBean("userTest", UserTest.class);
        System.out.println(userTest1 == userTest2);
    }


}
