package com.zhuweihao.SpringFramework.dao.impl;

import com.zhuweihao.SpringFramework.dao.FruitDao;
import com.zhuweihao.SpringFramework.pojo.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Author zhuweihao
 * @Date 2023/3/8 15:09
 * @Description com.zhuweihao.SpringFramework.dao.impl
 */
@Repository
public class FruitDaoImpl implements FruitDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Fruit selectById(Integer id) {
        String sql = "select * from Fruit where fid = ?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Fruit.class),id);
    }
}
