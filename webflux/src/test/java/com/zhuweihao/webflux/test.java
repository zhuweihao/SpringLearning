package com.zhuweihao.webflux;


import com.zhuweihao.webflux.pojo.Fruit;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;

/**
 * @Author zhuweihao
 * @Date 2023/3/12 20:03
 * @Description com.zhuweihao.webflux
 */
@SpringBootTest
public class test {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Test
    public void test(){
        Fruit fruit = jdbcTemplate.queryForObject("select * from Fruit where fid = 4",new BeanPropertyRowMapper<Fruit>(Fruit.class));
        System.out.println("fruit = " + fruit);
    }
}
