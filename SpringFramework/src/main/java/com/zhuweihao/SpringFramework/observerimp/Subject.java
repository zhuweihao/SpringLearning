package com.zhuweihao.SpringFramework.observerimp;

/**
 * @Author zhuweihao
 * @Date 2023/3/11 13:03
 * @Description com.zhuweihao.SpringFramework.observerimp
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
