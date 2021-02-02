package com.lsm.spring5_jdbc_tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //mary多100
    @Override
    public void addMoney() {
        String sql = "update t_account set money = money+? where username = ?";
        jdbcTemplate.update(sql,100,"mary");
    }
    //lucy少100
    @Override
    public void reduceMoney() {
        String sql = "update t_account set money = money-? where username = ?";
        jdbcTemplate.update(sql,100,"lucy");
    }

}
