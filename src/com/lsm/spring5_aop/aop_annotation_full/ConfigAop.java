package com.lsm.spring5_aop.aop_annotation_full;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan( basePackages = {"com.lsm.spring5_aop.aop_annotation_full"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
