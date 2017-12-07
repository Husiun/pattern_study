package com.xy.pattern.flyweightpattern;

/**
 * 测试类
 *
 * @author Ying Xiong
 * @date 2017/12/7
 */
public class Client {
    public static void main(String[] args) {
//        for(int i = 1;i < 4;i ++){
//            String subject = "科目"+i;
//            for(int j = 1;j < 30;j ++){
//                String key = subject + "地点"+j;
//                SignInfoFactory.getSignInfo(key);
//            }
//        }
//        SignInfoFactory.getSignInfo("科目1地点2");

        //外部条件定义不同测试耗时
        /**
         * 外部条件最好是用基本数据类型或者jdk中的类，如String
         */
        testString();
        testExtri();

    }

    private static void testString(){
        String key1 = "科目1上海";
        String key2 = "科目1上海";
        SignInfoFactory.getSignInfo(key1);//放入池中
        //享元
        long begin = System.currentTimeMillis();
        for(int i = 0;i < 100000;i ++){
            SignInfoFactory.getSignInfo(key2);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end - begin));
    }

    private static void testExtri(){
        ExtrinsicState extrinsicState1 = new ExtrinsicState();
        extrinsicState1.setSubject("科目1");
        extrinsicState1.setLocation("上海");
        ExtrinsicState extrinsicState2 = new ExtrinsicState();
        extrinsicState2.setSubject("科目1");
        extrinsicState2.setLocation("上海");
        //存入池中
        SignInfoFactory4Extri.getSignInfo(extrinsicState1);

        long begin = System.currentTimeMillis();
        for(int i = 0;i < 100000;i ++){
            SignInfoFactory4Extri.getSignInfo(extrinsicState2);
        }
        long end = System.currentTimeMillis();

        System.out.println("耗时2："+(end - begin));
    }
}
