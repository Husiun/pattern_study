package com.xy.pattern.observerpattern;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者类
 *
 * @author Ying Xiong
 * @date 2017/11/29
 */
public class LiSi implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯,我观察到韩非子有活动了，要开始报告了，，，");
        reportToBoss(arg.toString());
        System.out.println("BOSS计入功劳，以后奖赏");
    }

    private void reportToBoss(String contextMsg){
        System.out.println("报告BOSS，李斯正在从事"+contextMsg+"活动");
    }
}
