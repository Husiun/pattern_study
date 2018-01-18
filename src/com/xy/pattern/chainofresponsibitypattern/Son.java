package chainofresponsibitypattern;

/**
 * @author Ying Xiong
 * @date 2018/1/18
 */
public class Son extends Handler{
    public Son() {
        super(3);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("母亲像儿子请求了");
        System.out.println(women.getMessage());
        System.out.println("儿子同意了请求");
    }
}
