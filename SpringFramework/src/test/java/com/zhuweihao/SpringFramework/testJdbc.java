package com.zhuweihao.SpringFramework;

import com.zhuweihao.SpringFramework.config.SpringConfig;
import com.zhuweihao.SpringFramework.controller.FruitController;
import com.zhuweihao.SpringFramework.pojo.Fruit;
import com.zhuweihao.SpringFramework.service.FruitService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;

/**
 * @Author zhuweihao
 * @Date 2023/3/8 15:58
 * @Description com.zhuweihao.SpringFramework
 */
public class testJdbc {


    @Test
    public void testSelect(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
        FruitService fruitService = applicationContext.getBean("fruitServiceImpl", FruitService.class);
        Fruit fruit = fruitService.selectById(4);
        System.out.println("fruit = " + fruit);
    }
    @Test
    public void testAdd(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
        FruitController fruitController = applicationContext.getBean("fruitController", FruitController.class);
        fruitController.testAdd();
    }
    @Test
    public void testUpdate(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
        FruitController fruitController = applicationContext.getBean("fruitController", FruitController.class);
        //fruitController.testAdd();
        //fruitController.testUpdate();
        //fruitController.testDelete();
        fruitController.testBatch();
    }


}
