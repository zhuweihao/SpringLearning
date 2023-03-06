package com.zhuweihao.SpringFramework;

import com.zhuweihao.SpringFramework.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;

/**
 * @Author zhuweihao
 * @Date 2023/3/6 11:40
 * @Description com.zhuweihao.SpringFramework
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JUnit4Test {
    @Resource
    private User user;

    @Test
    public void testUser() {
        user.setId(1);
        user.setName("张三");
        user.setAge(5);
        System.out.println(user);
    }
}
