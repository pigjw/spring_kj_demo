package com.lsm.inject_attribute.inject_attribute_external_bean;

public class UserDaoImpl  implements UserDao{

    private String name;

    public UserDaoImpl(String name) {
        this.name = name;
    }

    @Override
    public void add() {
        System.out.println("UserDao 的实现类+name:"+name);
    }
}
