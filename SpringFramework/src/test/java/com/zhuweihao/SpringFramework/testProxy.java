package com.zhuweihao.SpringFramework;

import com.zhuweihao.SpringFramework.proxy.cglib.ProxyFactory;
import com.zhuweihao.SpringFramework.proxy.cglib.testDao;
import org.junit.Test;

/**
 * @Author zhuweihao
 * @Date 2023/3/8 10:24
 * @Description com.zhuweihao.SpringFramework
 */
public class testProxy {
    @Test
    public void test(){
        testDao target = new testDao();
        testDao proxyInstance = (testDao)new ProxyFactory(target).getProxyInstance();
        proxyInstance.test();
    }
}
