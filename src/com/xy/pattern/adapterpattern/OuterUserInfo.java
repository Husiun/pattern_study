package com.xy.pattern.adapterpattern;

import java.util.Map;

/**
 * 适配器类，把外部人员转换为自己公司的人员
 *
 * @author Ying Xiong
 * @date 2017/11/29
 */
public class OuterUserInfo extends OuterUser implements IUserInfo{
    /**
     * 适配器
     */
    private Map userBaseInfo = getUserBaseInfo();
    private Map userOfficeInfo = getUserOfficeInfo();
    private Map userHomeInfo = getUserHomeInfo();
    /*******用户个人信息*******/
    @Override
    public String getUserName() {
        String userName = (String)userBaseInfo.get("userName");
        return userName;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String)userBaseInfo.get("mobileNumber");
        return mobileNumber;
    }

    /*********用户家庭信息***********/
    @Override
    public String getHomeAddress() {
        String homeAddress = (String)userHomeInfo.get("homeAddress");
        return homeAddress;
    }

    @Override
    public String getHomeMobileNumber() {
        String homeMobileNumber = (String)userHomeInfo.get("homeMobileNumber");
        return homeMobileNumber;
    }

    /**********用户职业信息******************/
    @Override
    public String getJobPosition() {
        String jobPosition = (String)userOfficeInfo.get("jobPosition");
        return jobPosition;
    }

    @Override
    public String getOfficeMobileNumber() {
        String officeMobileNumber = (String)userOfficeInfo.get("officeMobileNumber");
        return officeMobileNumber;
    }
}
