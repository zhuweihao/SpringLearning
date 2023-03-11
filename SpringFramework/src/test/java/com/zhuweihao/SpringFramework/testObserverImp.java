package com.zhuweihao.SpringFramework;

import com.zhuweihao.SpringFramework.observerimp.BaiduSite;
import com.zhuweihao.SpringFramework.observerimp.CurrentConditions;
import com.zhuweihao.SpringFramework.observerimp.Observer;
import com.zhuweihao.SpringFramework.observerimp.WeatherData;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @Author zhuweihao
 * @Date 2023/3/11 13:16
 * @Description com.zhuweihao.SpringFramework
 */
public class testObserverImp {
    @Test
    public void test(){
        //观察者
        CurrentConditions currentConditions = new CurrentConditions();
        //subect
        WeatherData weatherData = new WeatherData();
        //将观察者注册到weatherData
        weatherData.registerObserver(currentConditions);
        System.out.println("通知全部观察者看看信息");
        weatherData.setData(30,34,12);
        //扩展第三方
        BaiduSite baiduSite = new BaiduSite();
        weatherData.registerObserver(baiduSite);
        weatherData.setData(40,50,60);
    }
}
