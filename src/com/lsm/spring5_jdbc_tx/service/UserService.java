package com.lsm.spring5_jdbc_tx.service;

import com.lsm.spring5_jdbc_tx.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional   如果事务注解在类上 那么这个类的所有方法都标注上了这个注解
public class UserService {
    @Autowired
    private UserDao userDao;
    @Transactional
    public void accountMoney(){
        userDao.addMoney();
        int i = 10/0;
        userDao.reduceMoney();
    }

}
