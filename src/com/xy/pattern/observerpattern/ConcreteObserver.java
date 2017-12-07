package com.xy.pattern.observerpattern;

/**
 * 具体观察者
 *
 * @author Ying Xiong
 * @date 2017/12/2
 */
public class ConcreteObserver implements Observer{
    private float temp;
    private final Subject subject;

    public ConcreteObserver(final Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp( final float temp) {
        this.temp = temp;
    }

    @Override
    public void update(final float temp) {
        this.temp = temp;
        System.out.println("改变后的温度："+temp);
    }
}
