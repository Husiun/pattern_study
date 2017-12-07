package com.xy.pattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体可观察者
 *
 * @author Ying Xiong
 * @date 2017/12/2
 */
public class ConcreteSubject implements Subject {
    private final List<Observer> list ;
    private float temp;

    public ConcreteSubject() {
        list = new ArrayList<Observer>();
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(final float temp) {
        this.temp = temp;
        tempChanged();
    }

    private void tempChanged(){
        System.out.println("温度要发生改变了哦，，，");
        notifyObservers();
    }

    @Override
    public void registerObserver(final Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(final Observer observer) {
        if(list.indexOf(observer) > 0){
            list.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o:list) {
            o.update(temp);
        }
    }
}
