package com.zhuweihao.SpringFramework.controller;

import com.zhuweihao.SpringFramework.pojo.Fruit;
import com.zhuweihao.SpringFramework.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhuweihao
 * @Date 2023/3/7 16:28
 * @Description com.zhuweihao.SpringFramework.controller
 */
//@Component(value = "fruitController")   //<bean id="fruitController" class="com.zhuweihao.SpringFramework.controller.FruitController"/>
@Controller //默认值是将类名称的首字母小写形式，这个注解和上面的效果相同
public class FruitController {
    @Resource
    private FruitService fruitService;
    public void test(){
        System.out.println("注解方式创建对象");
    }
    public void testS(){
        fruitService.testService();
    }
    public void testSelect(){
        Fruit fruit = fruitService.selectById(4);
        System.out.println("fruit = " + fruit);
    }
    public void testAdd(){
        fruitService.addFruit(new Fruit(1,"菠萝",33,55,"热带水果"));
    }
    public void testDelete(){
        fruitService.deleteById(19);
    }
    public void testUpdate(){
        fruitService.updatePriceById(19,44);
    }
    public void testBatch(){
        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{66,4});
        objects.add(new Object[]{66,5});
        objects.add(new Object[]{66,6});
        fruitService.updateBatch(objects);
    }
}
