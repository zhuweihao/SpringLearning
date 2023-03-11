package com.zhuweihao.SpringFramework.observerimp;

/**
 * @Author zhuweihao
 * @Date 2023/3/11 13:21
 * @Description com.zhuweihao.SpringFramework.observerimp
 */
public class BaiduSite implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;

    //weatherData调用
    @Override
    public void update(float temperature,float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        display();
    }

    private void display() {
        System.out.println("baidu temperature = " + temperature);
        System.out.println("baidu pressure = " + pressure);
        System.out.println("baidu humidity = " + humidity);
    }
}
