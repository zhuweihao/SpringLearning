package com.zhuweihao.SpringFramework.observerimp;

/**
 * @Author zhuweihao
 * @Date 2023/3/11 13:04
 * @Description com.zhuweihao.SpringFramework.observerimp
 */
public interface Observer {
    void update(float temperature,float pressure,float humidity);
}
