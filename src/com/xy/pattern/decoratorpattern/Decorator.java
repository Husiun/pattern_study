package com.xy.pattern.decoratorpattern;

/**
 * 定义装饰器类
 *
 * @author Ying Xiong
 * @date 2017/11/6
 */
public class Decorator extends SchoolReport {
    //持有一个成绩报告单
    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    public void report() {
        this.schoolReport.report();
    }

    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}
