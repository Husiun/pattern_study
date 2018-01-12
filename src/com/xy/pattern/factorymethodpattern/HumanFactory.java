package factorymethodpattern;

import factorymethodpattern.util.ClassUtil;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 造人工厂
 *
 * @author Ying Xiong
 * @date 2018/1/10
 */
public class HumanFactory {
    //为了消耗资源更少，定义一个类似于池的东西，享元
    private static Map<String,Human> humanMap = new HashMap<String,Human>();
    //定义方法，放一个人类进去把它造出来
    public static Human createHuman(Class c){
        //首先定义一个人类
        Human human = null;
        //如果池里面有，直接取出来
        if(humanMap.containsKey(c.getSimpleName())){
            human = humanMap.get(c.getSimpleName());
        }else{
            try {
                human = (Human)Class.forName(c.getName()).newInstance();
                //记得一定放入池中
                humanMap.put(c.getSimpleName(),human);
            } catch (ClassNotFoundException e) {
                System.out.println("找不到对应的人类，，，");
            }catch (IllegalAccessException e){
                System.out.println("给的人不合法，，，");
            }catch (InstantiationException e){
                System.out.println(",,,");
            }
        }

        return human ;
    }

    //放进去一团泥巴，随机造人
    public static Human createHuman(){
        Human human = null;
        List<Class> concreteHuman =  ClassUtil.getAllClassByInterface(Human.class);
        Random random = new Random(47);
        int rand = random.nextInt(concreteHuman.size());
        human = createHuman(concreteHuman.get(rand));
        return human;
    }
}
