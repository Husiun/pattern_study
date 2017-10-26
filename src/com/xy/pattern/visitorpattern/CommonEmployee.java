package com.xy.pattern.visitorpattern;

/**
 * 普通员工
 * 具体元素  通过accept定义的参数调用访问者的visit方法
 * @author Ying Xiong
 * @date 2017/10/26
 */
public class CommonEmployee extends Employee {
    //工作属性，对于普通员工很重要
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
