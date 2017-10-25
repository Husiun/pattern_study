package com.xy.pattern.templatepattern;

/**
 * 定义悍马车的模型，作为模版方法模式的模版类，
 *
 * @author Ying Xiong
 * @date 2017/10/24
 */
public abstract class HummerModel {
    /*
        既然是模型，也应该具备车的一些基本行为，启动，停止，喇叭响，引擎发出轰鸣声等
     */

    /*********************定义基本方法************************/
    /**
     * 模版方法模式的基本方法，必须由子类去实现的，他分为以下几种情况
     * 1.在基类中实现了的方法叫具体方法
     * 2.基类没有实现，子类实现了的，叫做抽象方法
     * 3.需要额外情况的叫钩子方法
     * 基本方法只是对自己的子类暴露，因此就没必要更多的暴露给客户用public权限，而是用protected
     */
    //启动
    protected abstract void start();

    //引擎响
    protected abstract void engineBoom();

    //喇叭响
    protected abstract void alarm();

    //停止
    protected abstract void stop();


    /******************定义template method模版方法**********************/
    /**
     * 基类定义模版方法不需要子类去修改的,不需要修改可以定义为final类型的
     */
    public final void run(){
        start();
        engineBoom();
        //alarm();
        //喇叭实现控制
        if(isAlarm()){
            alarm();
        }
        stop();
        System.out.println("汽车模型过程完成，，，");
    }
    //客户提出新需求，喇叭响应该具体的模型有控制不能默认让他响
    //那么就用到钩子方法hook method 有基类实现，子类可以重写
    protected  boolean isAlarm(){
        return true;
    }
}
