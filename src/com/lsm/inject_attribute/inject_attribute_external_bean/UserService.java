package com.lsm.inject_attribute.inject_attribute_external_bean;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        userDao.add();
    }
}
