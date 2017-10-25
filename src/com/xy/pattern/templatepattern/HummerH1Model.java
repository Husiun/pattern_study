package com.xy.pattern.templatepattern;

/**
 * 具体的实现类，h1型号
 *
 * @author Ying Xiong
 * @date 2017/10/24
 */
public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true;
    //基本方法的具体实现

    @Override
    protected void start() {
        System.out.println("H1型号的悍马车启动了，，，，");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H1型号的悍马车引擎哄哄响，，，");
    }

    @Override
    protected void alarm() {
        System.out.println("H1型号的悍马车遇到东西了鸣笛,,,");
    }

    @Override
    protected void stop() {
        System.out.println("H1型号的悍马车停下来了，，，，");
    }
    //客户对H1型号的悍马喇叭需求是由客户自己控制
    public void setAlarmFlag(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }
    //重写钩子方法

    @Override
    protected boolean isAlarm() {
        return alarmFlag;
    }
}
