package com.zhuweihao.SpringFramework;

import com.zhuweihao.SpringFramework.pojo.User;
import org.springframework.context.ApplicationContext;
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
    public void testUser() {
        user.setId(1);
        user.setName("张三");
        user.setAge(5);
        System.out.println(user);
    }

}
