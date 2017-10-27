package com.xy.pattern.visitorpattern;

/**
 * 接口 访问者
 * 抽象访问接口，通过visit 方法传入参数决定可以访问的对象
 *
 * @author Ying Xiong
 * @date 2017/10/26
 */
public interface IVisitor {
    /**
     * 抽象访问角色在定义访问方法的时候会为每一个节点定义一个方法
     * 把具体节点作为参数传入
     * @param commonEmployee
     */
    //定义访问方法，访问普通员工
    public void visit(CommonEmployee commonEmployee);
    //访问方法，也可以访问经理级别
    public void visit(Manager manager);
}
