package com.xy.pattern.observerpattern;

/**
 * 观察主题，被观察者接口
 *
 * @author Ying Xiong
 * @date 2017/12/2
 */
public interface Subject {
    /**
     * 观察对象应该具有注册，通知，移除注册三个基本方法
     */

     public void registerObserver(Observer observer);
     public void removeObserver(Observer observer);
     public void notifyObservers();
}
