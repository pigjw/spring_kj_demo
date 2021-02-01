package com.lsm.spring5_antoware.antowire_anotation.testdemo;

import com.lsm.spring5_antoware.antowire_anotation.config.SpringConfig;
import com.lsm.spring5_antoware.antowire_anotation.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    public void testDemo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5_antoware.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    @Test
    public void testNDemo(){
        //加载你的配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
