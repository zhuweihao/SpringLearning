package com.zhuweihao.SpringFramework;

import com.zhuweihao.SpringFramework.config.SpringConfig;
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

//    @Resource
//    private FruitService fruitService;
    @Test
    public void testSelect(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
        FruitService fruitService = applicationContext.getBean("fruitServiceImpl", FruitService.class);
        Fruit fruit = fruitService.selectById(4);
        System.out.println("fruit = " + fruit);
    }
}
