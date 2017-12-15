package com.xy.pattern.builderpattern;

import java.util.ArrayList;

/**
 * 汽车模型抽象类
 *
 * @author Ying Xiong
 * @date 2017/12/14
 */
public abstract class CarModel {
    /**
     * 汽车模型抽象类，模拟场景为根据客户给定的顺序生产不同的汽车模型
     * 如果直接面对product，必然会出现很多的需求到时候会烦，那么现在就想办法
     * 建造模型，同时有字典去定义了各个需要的模型的顺序，我们只面对字典类，让代码简单，清晰
     */
    //定义顺序用arraylist
    private ArrayList<String> sequece = new ArrayList<String>();

    //抽象类，抽象出汽车模型共同的方法，启动，停止，鸣叫，引擎响
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engine();
    //设定顺序，客户操作

    public void setSequece(ArrayList<String> sequece) {
        this.sequece = sequece;
    }
    //模型按顺序跑起来
    public final void run(){
        for(int i = 0;i < this.sequece.size();i ++){
            String meName = this.sequece.get(i);
            if(meName.equalsIgnoreCase("start")){
                this.start();//模型启动
            }else if(meName.equalsIgnoreCase("stop")){
                this.stop();//模型停止
            }else if(meName.equalsIgnoreCase("alarm")){
                this.alarm();//模型鸣笛
            }else{
                this.engine();//模型引擎响
            }
        }
    }
}
