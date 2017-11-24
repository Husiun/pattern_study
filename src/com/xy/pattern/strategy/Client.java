package com.xy.pattern.strategy;

/**
 * 具体的策略应用类
 *
 * @author Ying Xiong
 * @date 2017/11/24
 */
public class Client {
    public static void main(String[] args) {
        //定义一个容器
        Context context = null;
        //情况一出现，应用具体的策略解决
        context = new Context(new FStrategy());
        context.ope();
        //出现情况二，拿出具体的策略解决
        context = new Context(new TStrategy());
        context.ope();
        /**
         * 策略的顺序没有一定的，策略的具体内容没有用之前也是未知的
         */
    }
}
