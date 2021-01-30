package com.lsm.springbean_lifecycle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrdersTest {
    /**
     * 1.根据无参构造方法构造对象
     * 2.调用set方法进行附值
     * 3.执行初始化方法
     * 4.得到了对象-com.lsm.springbean_lifecycle.Orders@64f6106c
     * 5.执行销毁方法
     */
    @Test
    public void ordersTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springbean_lifecycle.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("4.得到了对象-"+orders);
        context.close();
    }

}
