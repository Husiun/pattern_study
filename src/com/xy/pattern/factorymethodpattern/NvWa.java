package factorymethodpattern;

import factorymethodpattern.util.ClassUtil;

/**
 * 造人者女娲
 *
 * @author Ying Xiong
 * @date 2018/1/10
 */
public class NvWa {
    public static void main(String[] args) {
        //造几个白色人种
//        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
//        whiteHuman.say();
//        whiteHuman.cry();
//        whiteHuman.laugh();
//        //造黑色人种
//        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
//        blackHuman.say();
//        blackHuman.laugh();
//        blackHuman.cry();
//        for(Class cls:ClassUtil.getAllClassByInterface(Human.class)){
//            System.out.println(cls.getSimpleName());
//        }

        /**
         * 随机造人，一下子很多放入
         */
        for(int i = 0;i < 1000;i ++){
            Human human = HumanFactory.createHuman();
            human.say();
        }
    }
}
