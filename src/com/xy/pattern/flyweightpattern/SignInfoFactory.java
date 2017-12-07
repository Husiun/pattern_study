package com.xy.pattern.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 产生SignInfo工厂类
 *
 * @author Ying Xiong
 * @date 2017/12/7
 */
public class SignInfoFactory {
    //定义池，以map形式存在
    private static Map<String,SignInfo> pool = new HashMap<String,SignInfo>();

    //工厂方法
    public static SignInfo getSignInfo(String key){
        SignInfo signInfo = null;
        if(!pool.containsKey(key)){
            signInfo = new SignInfoPool(key);
            pool.put(key,signInfo);
            //System.out.println("池里面没有，放入池中");
        }else{
            signInfo = pool.get(key);
            //System.out.println("从池里面去取");
        }
        return signInfo;
    }
}
