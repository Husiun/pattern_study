package com.xy.pattern.strategy;

/**
 * 策略的抽象
 *
 * @author Ying Xiong
 * @date 2017/11/24
 */
public interface IStrategy {
    /**
     * 策略不止一个，有多个，那么就抽象出来
     * 形成接口
     */

    void operation();
}
