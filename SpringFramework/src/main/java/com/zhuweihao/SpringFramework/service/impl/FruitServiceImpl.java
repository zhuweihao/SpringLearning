package com.zhuweihao.SpringFramework.service.impl;

import com.zhuweihao.SpringFramework.controller.FruitController;
import com.zhuweihao.SpringFramework.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhuweihao
 * @Date 2023/3/7 16:54
 * @Description com.zhuweihao.SpringFramework.service.impl
 */
@Service
public class FruitServiceImpl implements FruitService {
    @Override
    public void testService() {
        System.out.println("这里是service");
    }
}
