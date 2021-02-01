package com.lsm.spring5_antoware.antowire_anotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//使用@Configuration 就可以让这个类成为配置类 用来替代xml配置文件
@Configuration
@ComponentScan(basePackages = {"com.lsm.spring5_antoware.antowire_anotation"})
public class SpringConfig {
}
