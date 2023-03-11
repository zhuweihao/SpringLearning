package com.zhuweihao.SpringFramework.observer;

/**
 * @Author zhuweihao
 * @Date 2023/3/11 12:34
 * @Description com.zhuweihao.SpringFramework.observer
 */
public class CurrentConditions {
    //温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    //weatherData调用
    public void update(float temperature,float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        display();
    }

    private void display() {
        System.out.println("temperature = " + temperature);
        System.out.println("pressure = " + pressure);
        System.out.println("humidity = " + humidity);
    }
}
