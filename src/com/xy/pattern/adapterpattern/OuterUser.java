package com.xy.pattern.adapterpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 外部人员信息具体实现类
 *
 * @author Ying Xiong
 * @date 2017/11/29
 */
public class OuterUser implements IOuterUser {
    /**
     * 具体实现类
     */
    @Override
    public Map getUserBaseInfo() {
        Map baseInfo = new HashMap();
        baseInfo.put("userName","张三");
        baseInfo.put("mobileNumber","8888");
        return baseInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        Map homeInfo = new HashMap();
        homeInfo.put("homeAddress","北京");
        homeInfo.put("homeMobileNumber","5678");
        return homeInfo;
    }

    @Override
    public Map getUserOfficeInfo() {
        Map officeInfo = new HashMap();
        officeInfo.put("jobPosition","boss");
        officeInfo.put("officeMobileNumber","8888009");
        return officeInfo;
    }
}
