package com.xy.pattern.builderpattern;

import java.util.ArrayList;

/**
 * 字典类，用于组件车模型的顺序
 *
 * @author Ying Xiong
 * @date 2017/12/14
 */
public class Director {
    private ArrayList<String> sequece = new ArrayList<String>();
    private BenzBuilder benzBuilder = new BenzBuilder();

    //A型奔驰车模型组建顺序
    public BenzeModel getBenzAModel(){
        //顺序 引擎 ，启动，停止；
        this.sequece.clear();//把顺序清一下
        this.sequece.add("engine");
        this.sequece.add("start");
        this.sequece.add("stop");
        this.benzBuilder.setSequece(sequece);
        return (BenzeModel) this.benzBuilder.getCarModel();
    }

    //B型奔驰车模型组建顺序
    public BenzeModel getBenzBModel(){
        //B型顺序 引擎 ，鸣笛  你没有看错，他只需要这两个，也是奇葩了
        this.sequece.clear();//这个很有必要，因为是全局的变量，大家都在用，不清理一下，都可能出现莫名其妙的数据
        this.sequece.add("engine");
        this.sequece.add("alarm");
        this.benzBuilder.setSequece(sequece);//设定顺序
        return (BenzeModel) this.benzBuilder.getCarModel();
    }
}
