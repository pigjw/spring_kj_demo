package com.lsm.spring5_jdbc_tx;

import com.lsm.spring5demo.UserTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:spring5demo.xml")
//一键复合注解
@SpringJUnitConfig(locations = "classpath:spring5demo.xml")
public class JTest5 {
    @Autowired
    private UserTest userTest;

    @Test
    public void test(){
        System.out.println(userTest);
    }
}
