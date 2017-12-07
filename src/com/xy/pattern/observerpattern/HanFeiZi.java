package com.xy.pattern.observerpattern;

import java.util.Observable;

/**
 * 被观察者类
 *
 * @author Ying Xiong
 * @date 2017/11/29
 */
public class HanFeiZi extends Observable{
    /**
     * 通过历史上有名的两个人物李斯和韩非子来模拟观察者模式
     * 李斯是观察者，韩非子是被观察者，李斯将观察到的情况报告给它的boss
     * 观察者接口和被观察者接口来自JDK里面的Observable 和 Observer(java.util包)
     * Observable是类，Observer是接口注意
     */

    public void havaBreakFast(){
        System.out.println("我要用膳了，，，");
        setChanged();
        //通知观察者
        notifyObservers("韩非子用膳");
    }

    public void havaFun(){
        System.out.println("我要娱乐活动了，，，");
        setChanged();
        notifyObservers("韩非子搞娱乐活动");
    }
}
