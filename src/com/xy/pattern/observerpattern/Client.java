package com.xy.pattern.observerpattern;

/**
 * 测试类
 *
 * @author Ying Xiong
 * @date 2017/11/29
 */
public class Client {
    public static void main(String[] args) {
        HanFeiZi observable = new HanFeiZi();
        LiSi liSi = new LiSi();
        WangSi wangSi = new WangSi();
        //添加观察者
        observable.addObserver(liSi);
        observable.addObserver(wangSi);
        observable.havaBreakFast();
    }
}
