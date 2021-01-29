package com.lsm.inject_attribute_external_bean;

public class UserDaoImpl  implements UserDao{
    @Override
    public void add() {
        System.out.println("UserDao 的实现类");
    }
}
