package com.zhuweihao.SpringFramework;

import com.zhuweihao.SpringFramework.pojo.TestGeneric;
import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @Author zhuweihao
 * @Date 2023/3/10 16:03
 * @Description com.zhuweihao.SpringFramework
 */
public class testGenericApplicationContext {
    @Test
    public void test(){
        GenericApplicationContext genericApplicationContext = new GenericApplicationContext();
        genericApplicationContext.refresh();
        genericApplicationContext.registerBean("generic",TestGeneric.class,()-> {
            return new TestGeneric();
        });
        TestGeneric generic = (TestGeneric) genericApplicationContext.getBean("generic");
        System.out.println("generic = " + generic);
    }
}
