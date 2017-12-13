package com.xy.pattern.commandpattern;

/**
 * 代码组
 *
 * @author Ying Xiong
 * @date 2017/12/13
 */
public class CodeGroup extends Group{
    @Override
    protected void find() {
        System.out.println("找到代码组");
    }

    @Override
    protected void add() {
        System.out.println("客户新需求，代码添加，，，");
    }

    @Override
    protected void delete() {
        System.out.println("客户新需求，代码删除，，，");
    }

    @Override
    protected void change() {
        System.out.println("客户新需求，代码变更，，，");
    }

    @Override
    protected void plan() {
        System.out.println("代码变更计划");
    }
}
