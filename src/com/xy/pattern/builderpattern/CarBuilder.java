package com.xy.pattern.builderpattern;

import java.util.ArrayList;

/**
 * 抽象类车模型的建造者
 *
 * @author Ying Xiong
 * @date 2017/12/14
 */
public abstract class CarBuilder {
    //给我一个组装顺序
    protected abstract void setSequece(ArrayList<String> sequece);
    //获取车模型
    protected abstract CarModel getCarModel();
}
