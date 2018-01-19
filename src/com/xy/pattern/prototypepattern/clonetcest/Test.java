package prototypepattern.clonetcest;

/**
 * 测试
 *
 * @author Ying Xiong
 * @date 2018/1/19
 */
public class Test {
    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("张三");
        Thing clonething = thing.clone();//实现对象的拷贝时，类的构造函数不会再执行
        clonething.setValue("李四");
        System.out.println(thing.getValue());
    }
}
