package com.xy.pattern.builderpattern;

/**
 * 客户测试类
 *
 * @author Ying Xiong
 * @date 2017/12/14
 */
public class Client {
    public static void main(String[] args) {
        //先创建字典类实例出来
        Director director = new Director();
        //客户指定说要造10个A型奔驰模型
//        for(int i = 0;i < 10;i ++){
//            director.getBenzAModel().run();
//
//        }
        //客户需要5个B型奔驰模型
        for(int i = 0;i < 5; i ++){
            director.getBenzBModel().run();
        }

        /**
         * 建造者模式看起来很像工厂模式，都是在产生对象
         * 但是仔细对比起来，工厂模式就是简单粗暴的产生实例对象
         * 建造者模式不一样，它是产生指定顺序的实例对象
         */
    }
}
