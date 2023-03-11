package com.zhuweihao.SpringFramework.observer;

/**
 * @Author zhuweihao
 * @Date 2023/3/11 12:37
 * @Description com.zhuweihao.SpringFramework.observer
 */
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
    //调用接入方更新方法
    public void dataChange(){
        currentConditions.update(temperature,pressure,humidity);
    }
    //数据更新时进行调用
    public void setData(float temperature,float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        //将最新消息推送给接入方currentConditions
        dataChange();
    }
}
