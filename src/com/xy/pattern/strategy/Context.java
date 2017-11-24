package com.xy.pattern.strategy;

/**
 * 容器，存放策略的地方
 *
 * @author Ying Xiong
 * @date 2017/11/24
 */
public class Context {
    /**
     * 策略有很多个，但是不能这样闲闪着，得有一个地方将其管理起来
     * 统一应用
     */
    //持有对象
    private IStrategy iStrategy;
    //在构造的时候将其传入
    public Context(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }
    //容器不应该只是一个持有的功能，还应该给予统一应用的方法
    public void ope(){
        this.iStrategy.operation();
    }
}
