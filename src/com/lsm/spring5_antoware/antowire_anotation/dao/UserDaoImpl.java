package com.lsm.spring5_antoware.antowire_anotation.dao;

import org.springframework.stereotype.Repository;
//默认的话就是类名首字母小写
@Repository(value = "userDaoImpl")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add .....");
    }
}
