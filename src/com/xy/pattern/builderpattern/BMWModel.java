package com.xy.pattern.builderpattern;

/**
 * 宝马车模型
 *
 * @author Ying Xiong
 * @date 2017/12/14
 */
public class BMWModel extends CarModel {
    //具体车模型，宝马

    @Override
    protected void start() {
        System.out.println("宝马车启动");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停止");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车鸣笛");
    }

    @Override
    protected void engine() {
        System.out.println("宝马车引擎启动");
    }
}
