package com.zhuweihao.SpringFramework.dao;

import com.zhuweihao.SpringFramework.pojo.Fruit;

/**
 * @Author zhuweihao
 * @Date 2023/3/8 15:09
 * @Description com.zhuweihao.SpringFramework.dao
 */
public interface FruitDao {
    Fruit selectById(Integer id);
}
