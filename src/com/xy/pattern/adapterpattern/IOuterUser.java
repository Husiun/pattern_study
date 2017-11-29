package com.xy.pattern.adapterpattern;

import java.util.Map;

/**
 * 外部人员
 *
 * @author Ying Xiong
 * @date 2017/11/29
 */
public interface IOuterUser {
    /**
     * 外部人员对个人信息的提供
     * 跟本部人员有差别，提供出来的信息是经过封装了的
     *
     */
    //个人基本信息
    public Map getUserBaseInfo();

    //个人办公信息
    public Map getUserOfficeInfo();

    //个人家庭信息
    public Map getUserHomeInfo();
}
