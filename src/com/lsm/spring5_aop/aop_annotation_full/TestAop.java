package com.lsm.spring5_aop.aop_annotation_full;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop {
//    private static final Logger log = LoggerFactory.getLogger(TestAop.class);
    @Test
    public void testAop(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = context.getBean("user", User.class);
//        log.info("loginfo");
        user.add();
    }
}
