package com.zhuweihao.SpringFramework;

import com.zhuweihao.SpringFramework.config.SpringConfig;
import com.zhuweihao.SpringFramework.controller.FruitController;
import com.zhuweihao.SpringFramework.pojo.Book;
import com.zhuweihao.SpringFramework.pojo.Stu;
import com.zhuweihao.SpringFramework.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

/**
 * @Author zhuweihao
 * @Date 2023/3/6 10:51
 * @Description com.zhuweihao.SpringFramework
 */
@SpringJUnitConfig(locations = "classpath:applicationContext.xml")
public class myTest {

    @Resource
    private User user;

    @Resource
    private Book book;

    @Resource
    private Stu stu;

    @Resource
    private com.zhuweihao.SpringFramework.bean.myFactoryBean myFactoryBean;

    @Test
    public void testFactory() throws Exception {
        System.out.println("myFactoryBean = " + myFactoryBean);
        Book object = myFactoryBean.getObject();
        System.out.println("object = " + object);
        System.out.println("book = " + book);
    }

    @Test
    public void testStu(){
        System.out.println("stu = " + stu);
    }

    @Test
    public void testBook(){
        System.out.println("book = " + book);
    }
    @Test
    public void testDIValue(){
        System.out.println("user = " + user);
    }

    @Test
    public void Demo() {
        //加载spring配置文件
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取配置创建的对象
        User user = applicationContext.getBean("user", User.class);
        user.setId(1);
        user.setName("张三");
        user.setAge(5);
        System.out.println(user);
    }

    @Test
    public void testComponent(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        FruitController fruitController = applicationContext.getBean("fruitController", FruitController.class);
        fruitController.test();
        fruitController.testS();
    }

    @Test
    public void testUser() {
        user.setId(1);
        user.setName("张三");
        user.setAge(5);
        System.out.println(user);
    }

    @Test
    public void testAnnotation(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
        FruitController fruitController = applicationContext.getBean("fruitController", FruitController.class);
        fruitController.test();
        fruitController.testS();
        fruitController.testSelect();
    }
}
