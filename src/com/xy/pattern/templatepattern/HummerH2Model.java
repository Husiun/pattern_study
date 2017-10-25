package com.xy.pattern.templatepattern;

/**
 * 具体的悍马型号H2
 *
 * @author Ying Xiong
 * @date 2017/10/24
 */
public class HummerH2Model extends HummerModel {
    //基本方法子类具体实现

    @Override
    protected void start() {
        System.out.println("H2型号悍马车启动，，，");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H2悍马车引擎哄哄响，，，");
    }

    @Override
    protected void alarm() {
        System.out.println("H2悍马车遇到东西了鸣笛，，，");

    }

    @Override
    protected void stop() {
        System.out.println("H2悍马车停下来了，，，");
    }

    //H2信号的喇叭是个摆设，不响的

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
