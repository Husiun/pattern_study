package com.xy.pattern.decoratorpattern;

/**
 * 签名类，
 *
 * @author Ying Xiong
 * @date 2017/11/6
 */
public class Father {
    public static void main(String[] args) {
        SchoolReport schoolReport = new ForthGradeSchoolReport();
        schoolReport = new HighScoreDecorator(schoolReport);
        schoolReport = new SortDecorator(schoolReport);
        schoolReport.report();
        schoolReport.sign("张三");
    }
}
