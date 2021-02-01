package com.lsm.spring5_aop.aop_xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
    @Test
    public void bookTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5_aop_xml.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }

}
