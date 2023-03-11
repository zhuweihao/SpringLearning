package com.zhuweihao.SpringFramework;

import com.zhuweihao.SpringFramework.config.SpringConfig;
import com.zhuweihao.SpringFramework.controller.BankController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author zhuweihao
 * @Date 2023/3/10 11:08
 * @Description com.zhuweihao.SpringFramework
 */
public class testBank {
    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BankController bankController = applicationContext.getBean("bankController", BankController.class);
        bankController.testBank();
    }
}
