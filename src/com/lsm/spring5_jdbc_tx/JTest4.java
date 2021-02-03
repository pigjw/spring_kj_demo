package com.lsm.spring5_jdbc_tx;

import com.lsm.spring5demo.UserTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //指定单元测试框架版本
@ContextConfiguration("classpath:spring5demo.xml") //加载配置文件 相当于 ApplicationContext context= new ClassApplicationContext("xx.xml");
public class JTest4 {
    @Autowired
    private UserTest userTest;

    @Test
    public void test(){
        System.out.println(userTest);
    }

}
