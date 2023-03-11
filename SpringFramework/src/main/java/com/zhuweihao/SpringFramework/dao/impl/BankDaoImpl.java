package com.zhuweihao.SpringFramework.dao.impl;

import com.zhuweihao.SpringFramework.dao.BankDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Author zhuweihao
 * @Date 2023/3/9 21:19
 * @Description com.zhuweihao.SpringFramework.dao.impl
 */
@Repository
public class BankDaoImpl implements BankDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public void addMoney() {

    }

    @Override
    public void reduceMoney() {

    }

    @Override
    public void updateMoneyByAccount(String account, Integer money) {
        String sql="update bank set money=? where account=?";
        jdbcTemplate.update(sql,money,account);
    }

    @Override
    public Integer getAccountBalance(String account) {
        String sql="select money from bank where account=?";

        return jdbcTemplate.queryForObject(sql,Integer.class,account);
    }
}
