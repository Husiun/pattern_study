package chainofresponsibitypattern;

/**
 * 具体类，父亲类
 *
 * @author Ying Xiong
 * @date 2018/1/18
 */
public class Father extends Handler{
    public Father() {
        super(1);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("&&&女儿像父亲请求:");
        System.out.println(women.getMessage());
        System.out.println("父亲大人同意了");
    }
}
