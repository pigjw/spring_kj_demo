package com.lsm.spring5_jdbc_tx;

import com.lsm.spring5_jdbc_tx.config.TxConfig;
import com.lsm.spring5_jdbc_tx.service.UserService;
import com.lsm.spring5_jdbctemplat.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class TestJdbc {
    @Test
    public void testJdbc(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring_mysql_jdbc_tx.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    //函数式编程测试
    @Test
    public void genericTest(){
        //1.创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //调用context的一个方法进行对象的注册 交给springioc去管理
        context.refresh();
        context.registerBean("userService",UserService.class,() -> new UserService());
//        UserService userService = (UserService)context.getBean("com.lsm.spring5_jdbc_tx.service.UserService");
        UserService userService = (UserService)context.getBean("userService");
        System.out.println(userService);
    }

}
