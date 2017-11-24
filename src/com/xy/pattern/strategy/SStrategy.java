package com.xy.pattern.strategy;

/**
 * 策略二
 *
 * @author Ying Xiong
 * @date 2017/11/24
 */
public class SStrategy implements IStrategy {
    /**
     * 具体的策略二
     */
    @Override
    public void operation() {
        System.out.println("我是策略二,,,,,");
    }
}
