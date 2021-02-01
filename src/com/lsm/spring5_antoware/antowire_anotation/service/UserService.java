package com.lsm.spring5_antoware.antowire_anotation.service;

import com.lsm.spring5_antoware.antowire_anotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//注解里边的value可以省略  默认不写就是类名称首字母小写
//@Component(value = "userService") //<bean id="" class="com...."></bean> 和这个是等价的
@Service
public class UserService {
    //根据类型进行注入有一个缺点就是不知道找那个实现类 我们可以在后边加一个名称
//    @Autowired()
//    @Qualifier(value = "userDaoImpl")  //和@Autowired()是一起使用的
    @Value(value = "abc")
    private String name;

    @Resource(name = "userDaoImpl")
    private UserDao userDao;

    public void add(){
        System.out.println("userDao:"+userDao);
        System.out.println("service add.... name"+name);
        userDao.add();
    }
}
