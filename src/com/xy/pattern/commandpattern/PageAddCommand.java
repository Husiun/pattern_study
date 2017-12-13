package com.xy.pattern.commandpattern;

/**
 * 美工添加命令
 *
 * @author Ying Xiong
 * @date 2017/12/13
 */
public class PageAddCommand extends Command{
    /**
     * 美工添加页面的命令
     */
    @Override
    protected void excute() {
        super.pageGroup.find();
        super.pageGroup.add();
        super.pageGroup.plan();
    }
}
