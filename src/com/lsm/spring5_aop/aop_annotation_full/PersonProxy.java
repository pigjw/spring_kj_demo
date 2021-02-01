package com.lsm.spring5_aop.aop_annotation_full;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class PersonProxy {

    @Before(value = "execution(* com.lsm.spring5_aop.aop_annotation_full.User.add(..))")
    public void pointDemo(){
        System.out.println("Person Before......");
    }
}
