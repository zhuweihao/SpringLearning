package com.zhuweihao.SpringFramework.dao;

import com.zhuweihao.SpringFramework.pojo.Fruit;

import java.util.List;

/**
 * @Author zhuweihao
 * @Date 2023/3/8 15:09
 * @Description com.zhuweihao.SpringFramework.dao
 */
public interface FruitDao {
    Fruit selectById(Integer id);

    void addFruit(Fruit fruit);

    void deleteById(Integer id);

    void updatePriceById(Integer id,Integer price);

    void updateBatch(List<Object[]> bathgArgs);
}
