package com.xy.pattern.visitorpattern;

/**
 * 经理级别类
 *
 * @author Ying Xiong
 * @date 2017/10/26
 */
public class Manager extends Employee {
    //业绩，对于经理级别的人很重要
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
