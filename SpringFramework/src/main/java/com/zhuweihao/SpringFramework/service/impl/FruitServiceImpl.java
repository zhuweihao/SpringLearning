package com.zhuweihao.SpringFramework.service.impl;

import com.zhuweihao.SpringFramework.controller.FruitController;
import com.zhuweihao.SpringFramework.dao.BankDao;
import com.zhuweihao.SpringFramework.dao.FruitDao;
import com.zhuweihao.SpringFramework.pojo.Fruit;
import com.zhuweihao.SpringFramework.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author zhuweihao
 * @Date 2023/3/7 16:54
 * @Description com.zhuweihao.SpringFramework.service.impl
 */
@Service
public class FruitServiceImpl implements FruitService {

    @Resource
    private FruitDao fruitDao;
    @Resource
    private BankDao bankDao;

    @Override
    public void testService() {
        System.out.println("这里是service");
    }

    @Override
    public Fruit selectById(Integer id) {
        return fruitDao.selectById(id);
    }

    @Override
    public void addFruit(Fruit fruit) {
        fruitDao.addFruit(fruit);
    }

    @Override
    public void deleteById(Integer id) {
        fruitDao.deleteById(id);
    }

    @Override
    public void updatePriceById(Integer id, Integer price) {
        fruitDao.updatePriceById(id,price);
    }

    @Override
    public void updateBatch(List<Object[]> bathgArgs) {
        fruitDao.updateBatch(bathgArgs);
    }


}
