package com.xy.pattern.commandpattern;

/**
 * 美工组
 *
 * @author Ying Xiong
 * @date 2017/12/13
 */
public class PageGroup extends Group{
    @Override
    protected void find() {
        System.out.println("找到美工组，，，");
    }

    @Override
    protected void add() {
        System.out.println("客户要求添加页面，，，");
    }

    @Override
    protected void delete() {
        System.out.println("客户要求删除页面，，，");
    }

    @Override
    protected void change() {
        System.out.println("客户要求页面更改，，，");
    }

    @Override
    protected void plan() {
        System.out.println("给出页面更改计划，，，");
    }
}
