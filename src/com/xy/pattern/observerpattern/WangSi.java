package com.xy.pattern.observerpattern;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者类
 *
 * @author Ying Xiong
 * @date 2017/11/29
 */
public class WangSi implements Observer {
    /**
     * 跟李斯一样偷窥韩非子的人
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("韩非子即将开始活动了，，，");
        happy(arg.toString());
        System.out.println("真呀嘛高兴，，，，，，");
    }

    private void happy(String conMsg){
        System.out.println("我很高兴，看到："+conMsg+"活动");
    }
}
