package com.zhuweihao.SpringFramework.reactor;

import java.util.Observable;

/**
 * @Author zhuweihao
 * @Date 2023/3/11 12:25
 * @Description com.zhuweihao.SpringFramework.reactor
 */
public class ObserverDemo extends Observable {
    public static void main(String[] args) {
        ObserverDemo observerDemo = new ObserverDemo();
        //添加观察者
        observerDemo.addObserver((o, arg) -> {
            System.out.println("发生变化");
        });
        observerDemo.addObserver((o, arg) -> {
            System.out.println("收到被观察者的通知，准备改变");
        });
        //数据变化
        observerDemo.setChanged();
        //通知
        observerDemo.notifyObservers();
    }
}
