package com.zhuweihao.SpringFramework.service.impl;

import com.zhuweihao.SpringFramework.controller.FruitController;
import com.zhuweihao.SpringFramework.dao.FruitDao;
import com.zhuweihao.SpringFramework.pojo.Fruit;
import com.zhuweihao.SpringFramework.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author zhuweihao
 * @Date 2023/3/7 16:54
 * @Description com.zhuweihao.SpringFramework.service.impl
 */
@Service
public class FruitServiceImpl implements FruitService {

    @Resource
    private FruitDao fruitDao;

    @Override
    public void testService() {
        System.out.println("这里是service");
    }

    @Override
    public Fruit selectById(Integer id) {
        return fruitDao.selectById(id);
    }
}
