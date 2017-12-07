package com.xy.pattern.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义外部条件对象工厂类
 *
 * @author Ying Xiong
 * @date 2017/12/7
 */
public class SignInfoFactory4Extri {
    private static Map<ExtrinsicState,SignInfo> pool = new HashMap<ExtrinsicState,SignInfo>();

    public static SignInfo getSignInfo(ExtrinsicState key){
        SignInfo signInfo = null;
        if(!pool.containsKey(key)){
            signInfo = new SignInfo();
            pool.put(key,signInfo);
        }else{
            signInfo = pool.get(key);
        }
        return signInfo;
    }
}
