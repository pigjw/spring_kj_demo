package com.lsm.spring5demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring5Demo {
    @Test
    public void testSpring5Demo(){
        //1.加载spring的配置文件  context就可以理解为我们的ioc容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5demo.xml");
        //2.获取配置创建的对象
        UserTest userTest = context.getBean("userTest", UserTest.class);
        userTest.add();
    }
}
