package com.xy.pattern.strategy;

/**
 * 策略一
 *
 * @author Ying Xiong
 * @date 2017/11/24
 */
public class FStrategy implements IStrategy{
    /**
     * 执行策略一
     */
    @Override
    public void operation() {
        System.out.println("我是策略1，，，，，");
    }
}
