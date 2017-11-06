package com.xy.pattern.decoratorpattern;

/**
 * 成绩单类 抽象类
 *
 * @author Ying Xiong
 * @date 2017/11/6
 */
public abstract class SchoolReport {
    //定义两个方法，报告成绩，家长签名
    public abstract void report();
    public abstract void sign(String name);
}
