package chainofresponsibitypattern;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 测试类
 *
 * @author Ying Xiong
 * @date 2018/1/18
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 随机产生一些女性
         */
        Random random = new Random();
        List<IWomen> womenList = new ArrayList<IWomen>();
        for(int i = 0;i < 6;i ++){
            womenList.add(new Women(random.nextInt(4),"想出去逛街"));
        }

        /**
         * 三个父权级别
         */
        Father father = new Father();
        Hasband hasband = new Hasband();
        Son son = new Son();
        father.setNextHandler(hasband);
        hasband.setNextHandler(son);
        /****遍历***/
        for (IWomen w:womenList) {
            father.handleMessagr(w);
        }
    }
}
