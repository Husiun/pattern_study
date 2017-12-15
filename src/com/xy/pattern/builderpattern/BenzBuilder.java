package com.xy.pattern.builderpattern;

import java.util.ArrayList;

/**
 * 具体建造者，奔驰车模型
 *
 * @author Ying Xiong
 * @date 2017/12/14
 */
public class BenzBuilder extends CarBuilder {
    private BenzeModel benzeModel = new BenzeModel();

    @Override
    protected CarModel getCarModel() {
        return this.benzeModel;
    }

    @Override
    protected void setSequece(ArrayList<String> sequece) {
        this.benzeModel.setSequece(sequece);
    }
}
