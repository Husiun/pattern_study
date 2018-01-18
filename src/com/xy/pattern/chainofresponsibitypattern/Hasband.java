package chainofresponsibitypattern;

/**
 * @author Ying Xiong
 * @date 2018/1/18
 */
public class Hasband extends Handler{
    public Hasband() {
        super(2);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("妻子像丈夫请求&&&&");
        System.out.println(women.getMessage());
        System.out.println("丈夫同意了");
    }
}
