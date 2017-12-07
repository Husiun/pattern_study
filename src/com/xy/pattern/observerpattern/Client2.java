package com.xy.pattern.observerpattern;

/**
 * 测试
 *
 * @author Ying Xiong
 * @date 2017/12/2
 */
public class Client2 {
    public static void main(String[] args) {
        final ConcreteSubject subject = new ConcreteSubject();
        //subject.setTemp(10.0f);
        final ConcreteObserver observer = new ConcreteObserver(subject);
        //subject.registerObserver(observer);
        subject.setTemp(10.0f);
        //observer.setTemp(20.0f);

    }
}
