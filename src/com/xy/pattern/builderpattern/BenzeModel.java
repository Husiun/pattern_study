package com.xy.pattern.builderpattern;

/**
 * 奔驰车模型
 *
 * @author Ying Xiong
 * @date 2017/12/14
 */
public class BenzeModel extends CarModel {
    //具体的车模型

    @Override
    protected void start() {
        System.out.println("奔驰车启动，，，");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停止，，，");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车鸣笛，，，");
    }

    @Override
    protected void engine() {
        System.out.println("奔驰车引擎发动，，，");
    }
}
