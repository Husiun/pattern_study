package com.xy.pattern.commandpattern;

/**
 * 需求组
 *
 * @author Ying Xiong
 * @date 2017/12/13
 */
public class RequirementGroup extends Group{
    @Override
    protected void find() {
        System.out.println("找到需求组，，，，");
    }

    @Override
    protected void add() {
        System.out.println("客户要求添加一个需求，，，");
    }

    @Override
    protected void delete() {
        System.out.println("客户要求删除一个需求，，，");
    }

    @Override
    protected void change() {
        System.out.println("客户要求更改一个需求，，，");
    }

    @Override
    protected void plan() {
        System.out.println("客户要求给出需求变更计划，，，");
    }
}
