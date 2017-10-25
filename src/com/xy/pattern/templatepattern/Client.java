package com.xy.pattern.templatepattern;

/**
 * 测试类
 *
 * @author Ying Xiong
 * @date 2017/10/24
 */
public class Client {
    public static void main(String[] args) {
//        System.out.println("方法调用，具体类完成");
//        //定义一个H1型号悍马车
//        HummerModel hummerModel1 = new HummerH1Model();
//        hummerModel1.run();
//        //定义一个H2型号的悍马车
//        HummerModel hummerModel2 = new HummerH2Model();
//        hummerModel2.run();

        /**
         * 以上模版方法模式已经测试稳妥，但是如果那天客户觉得喇叭的问题不应该是默认响的，
         * 而是应该不同型号的悍马车对喇叭响有控制，
         * 那么这时候就用到钩子方法,只需要修改基类即可
         */
        HummerModel hummerModel2 = new HummerH2Model();
        hummerModel2.run();
        //H1模型有客户控制喇叭
        HummerH1Model hummerModel1 = new HummerH1Model();
        hummerModel1.setAlarmFlag(false);
        hummerModel1.run();//父类调用子类具体方法的实现
    }
}
