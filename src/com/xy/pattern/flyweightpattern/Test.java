package com.xy.pattern.flyweightpattern;

/**
 * jdk中String类用到的享元模式测试
 *
 * @author Ying Xiong
 * @date 2017/12/7
 */
public class Test {
    public static void main(String[] args) {
        String str1 = "北京";
        String str2 = "你好";
        String str3 = "北京你好";
        System.out.println("result = "+(str3 == (str1+str2)));//false
        String str4 = (str1 + str2).intern();
        System.out.println("result2 = "+(str4 == str3));//true,intern()方法的含义就是如果String对象池里有，就从
        //池里面取，如果没有就创建
    }
}
