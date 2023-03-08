package com.zhuweihao.SpringFramework.service;

import com.zhuweihao.SpringFramework.pojo.Fruit;

/**
 * @Author zhuweihao
 * @Date 2023/3/7 16:54
 * @Description com.zhuweihao.SpringFramework.service
 */
public interface FruitService {
    public void testService();
    public Fruit selectById(Integer id);
}
