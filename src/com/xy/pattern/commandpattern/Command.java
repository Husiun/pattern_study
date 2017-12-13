package com.xy.pattern.commandpattern;

/**
 * 命令类
 *
 * @author Ying Xiong
 * @date 2017/12/13
 */
public abstract class Command {
    /**
     * 命令类，抽象的，具体的命令还由其子类执行
     * ,也就是根据客户给的命令要怎么做
     */
    //命令里面应该持有各个小组
    protected RequirementGroup requirementGroup = new RequirementGroup();
    protected PageGroup pageGroup = new PageGroup();
    protected CodeGroup codeGroup = new CodeGroup();

    protected abstract void excute();

}
