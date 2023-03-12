package com.zhuweihao.webflux.dao.impl;


import com.zhuweihao.webflux.dao.FruitDao;
import com.zhuweihao.webflux.pojo.Fruit;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

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
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Fruit>(Fruit.class),id);
    }

    @Override
    public List<Fruit> selectAll() {
        String sql="select * from Fruit";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Fruit.class));
    }

    @Override
    public void addFruit(Fruit fruit) {
        String sql="insert into Fruit(fname,price,fcount,remark) values(?,?,?,?)";
        jdbcTemplate.update(sql,fruit.getFname(),fruit.getFcount(),fruit.getPrice(),fruit.getRemark());
    }

    @Override
    public void deleteById(Integer id) {
        String sql="delete from Fruit where fid=?";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public void updatePriceById(Integer id, Integer price) {
        String sql="update Fruit set price=? where fid=?";
        jdbcTemplate.update(sql,price,id);
    }

    @Override
    public void updateBatch(List<Object[]> bathgArgs) {
        String sql="update Fruit set price=? where fid=?";
        jdbcTemplate.batchUpdate(sql,bathgArgs);
    }
}
