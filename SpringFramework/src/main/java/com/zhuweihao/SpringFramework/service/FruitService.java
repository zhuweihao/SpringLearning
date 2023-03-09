package com.zhuweihao.SpringFramework.service;

import com.zhuweihao.SpringFramework.pojo.Fruit;

import java.util.List;

/**
 * @Author zhuweihao
 * @Date 2023/3/7 16:54
 * @Description com.zhuweihao.SpringFramework.service
 */
public interface FruitService {
    void testService();
    Fruit selectById(Integer id);
    void addFruit(Fruit fruit);
    void deleteById(Integer id);
    void updatePriceById(Integer id,Integer price);
    void updateBatch(List<Object[]> bathgArgs);
    //转账操作
    void transferAccounts(String transferOutAccount,Integer transferOutAmount,String transferInAccount,Integer transferInAmount);
}
