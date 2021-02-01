package com.lsm.spring5_aop.aop_annotation;

import org.springframework.stereotype.Component;

@Component
public class User {
    public void add(){
        int a = 10/0;
        System.out.println("add.....");
    };
}
