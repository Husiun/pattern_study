package com.xy.pattern.commandpattern;

/**
 * 抽象出项目组
 *
 * @author Ying Xiong
 * @date 2017/12/13
 */
public abstract class Group {
    /**
     * 命令模式，模拟甲方与开发相关的需求组，代码组，美工组的交互，
     * 各组抽象出一个抽象类
     */
    //甲方找到对应的项目组
    protected abstract void find();
    //增加需求
    protected abstract void add();
    //删除需求
    protected abstract void delete();
    //修改需求
    protected abstract void change();
    //给出的变更计划
    protected  abstract void plan();
}
