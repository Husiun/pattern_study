package com.xy.pattern.strategy;

/**
 * 策略三
 *
 * @author Ying Xiong
 * @date 2017/11/24
 */
public class TStrategy implements IStrategy {
    /**
     * 具体策略三
     */
    @Override
    public void operation() {
        System.out.println("我是策略三,,,,,");
    }
}
