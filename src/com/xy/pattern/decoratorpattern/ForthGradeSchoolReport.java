package com.xy.pattern.decoratorpattern;

/**
 * 四年级的成绩单，实现类
 *
 * @author Ying Xiong
 * @date 2017/11/6
 */
public class ForthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("数学成绩：70");
        System.out.println("语文成绩:75");
        System.out.println("科学成绩:68");
    }

    @Override
    public void sign(String name) {
        System.out.println();
        System.out.println("      家长签名："+name);
    }
}
