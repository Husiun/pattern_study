package com.xy.pattern.adapterpattern;

/**
 * 员工信息接口
 *
 * @author Ying Xiong
 * @date 2017/11/28
 *
 * 模拟适配器模式
 * 现有本公司的员工信息，但是公司新加了业务要求有外部公司人员加入
 *
 *本公司人员的信息组件方式跟外部人员信息的组建不一样，然而又要进行一个对接
 *所以现在就考虑适配器模式，进行一个适配
 *适配器模式很好的一个例子就是咱们用的笔记本连接的中间有个转换的东西，
 *220v的电压能转为36v安全电压，110v的也行，这就是适配器
 */
public interface IUserInfo {
    /**
     * 用户信息对象，本公司
     */
    //获得用户姓名
    public String getUserName();
    //获得家庭地址
    public String getHomeAddress();
    //获得手机号码
    public String getMobileNumber();
    //获得办公电话
    public String getOfficeMobileNumber();
    //获得个人职位
    public String getJobPosition();
    //获得家庭电话号码
    public String getHomeMobileNumber();
}
