package chainofresponsibitypattern;

/**
 * 女性接口
 *
 * @author Ying Xiong
 * @date 2018/1/18
 */
public interface IWomen {
    //自己是哪一个类型的
    public int getType();
    //自己的请求是什么a
    public String getMessage();
}
