package com.xy.pattern.decoratorpattern;

/**
 * 成绩排名装饰器类
 *
 * @author Ying Xiong
 * @date 2017/11/6
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }
    //汇报成绩之后马上补充排名情况
    private void sort(){
        System.out.println("班级排名靠前，25，，，，，");
    }
    //汇报

    @Override
    public void report() {
        super.report();
        this.sort();
    }
}
