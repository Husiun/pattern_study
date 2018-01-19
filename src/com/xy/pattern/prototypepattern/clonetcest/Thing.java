package prototypepattern.clonetcest;

import java.util.ArrayList;

/**
 * 测试
 *
 * @author Ying Xiong
 * @date 2018/1/19
 */
public class Thing implements Cloneable{
    private /*final*/ ArrayList<String> arrayList = new ArrayList<String>();//私有变量
    public Thing() {
       // System.out.println("构造函数执行了，，，");
    }

    @Override
    public Thing clone(){
        Thing thing = null;
        try {
            thing = (Thing)super.clone();
            //深拷贝
            this.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    /***
     * 对arrylist设值和取值
     */
    public void setValue(String value){
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue(){
        return this.arrayList;
    }
}
