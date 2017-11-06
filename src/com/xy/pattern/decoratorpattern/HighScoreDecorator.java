package com.xy.pattern.decoratorpattern;

/**
 * 分数装饰类
 *
 * @author Ying Xiong
 * @date 2017/11/6
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void highScore(){
        System.out.println("看成绩单之前声明，语数外总分是80分制，，，");
    }
    //仍然得签名


    @Override
    public void report() {
        //先声明最高成绩
        this.highScore();
        //报告成绩
        super.report();
    }
}
