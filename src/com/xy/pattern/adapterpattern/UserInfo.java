package com.xy.pattern.adapterpattern;

/**
 * 个人信息实现类
 *
 * @author Ying Xiong
 * @date 2017/11/29
 */
public class UserInfo implements IUserInfo {
    /**
     * 个人信息实现类
     */
    @Override
    public String getUserName() {
        System.out.println("我的姓名是：，，，，，");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("个人电话号码：。。。。。");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("个人家庭地址。。。。。。。");
        return null;
    }

    @Override
    public String getHomeMobileNumber() {
        System.out.println("个人家庭电话。。。。");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("个人职位是。。。。。。");
        return null;
    }

    @Override
    public String getOfficeMobileNumber() {
        System.out.println("个人办公室座机号码。。。。。。");
        return null;
    }
}
