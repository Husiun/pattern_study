package com.xy.pattern.adapterpattern;

/**
 * 测试类
 *
 * @author Ying Xiong
 * @date 2017/11/29
 */
public class Client {
    public static void main(String[] args) {
        IUserInfo userInfo = new OuterUserInfo();
        for(int i = 0;i < 10; i++){
            String mNumber = userInfo.getMobileNumber();
            System.out.println("电话号码："+mNumber);
        }
    }
}
