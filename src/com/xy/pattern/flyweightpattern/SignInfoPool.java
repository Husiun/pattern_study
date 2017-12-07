package com.xy.pattern.flyweightpattern;

/**
 * signinfo对象池
 *
 * @author Ying Xiong
 * @date 2017/12/7
 */
public class SignInfoPool extends SignInfo{
    //外部条件，最好是基本类型或已经存在的类型，而不是自己去构造，会比较耗时
    private String key;//定义一个去池中取的标识

    public SignInfoPool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
