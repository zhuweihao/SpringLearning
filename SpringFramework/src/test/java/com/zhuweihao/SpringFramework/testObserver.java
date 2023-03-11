package com.zhuweihao.SpringFramework;

import com.zhuweihao.SpringFramework.observer.CurrentConditions;
import com.zhuweihao.SpringFramework.observer.WeatherData;
import org.junit.Test;

/**
 * @Author zhuweihao
 * @Date 2023/3/11 12:44
 * @Description com.zhuweihao.SpringFramework
 */
public class testObserver {
    @Test
    public void test1() {
        //创建接入方currentConditions
        CurrentConditions currentConditions = new CurrentConditions();
        //创建WeatherData并将接入方currentConditions传递到weatherData中
        WeatherData weatherData = new WeatherData(currentConditions);
        //更新天气情况
        weatherData.setData(30, 150, 40);
        //天气发生变化
        System.out.println("天气情况发生变化");
        weatherData.setData(40, 160, 20);
    }
}
