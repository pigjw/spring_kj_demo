package com.lsm.spring5_jdbc_tx;

import com.lsm.spring5_jdbc_tx.config.TxConfig;
import com.lsm.spring5_jdbc_tx.service.UserService;
import com.lsm.spring5_jdbctemplat.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {
    @Test
    public void testJdbc(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring_mysql_jdbc_tx.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();



    }
}
