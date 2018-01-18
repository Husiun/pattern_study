package chainofresponsibitypattern;

/**
 * 实现类，具体的女性
 *
 * @author Ying Xiong
 * @date 2018/1/18
 */
public class Women  implements IWomen{
    //定义类型
    private int type = 0;
    //定义请求内容
    private String reqMessage = "";
    //constructor直接放进去

    public Women(int _type, String _reqMessage) {
        this.type = _type;
        //为了好看一点switch判断一下
        this.reqMessage = reqMessage;
        switch (this.type){
            case 1:
                this.reqMessage = "女儿的请求是:"+_reqMessage;
                break;
            case 2:
                this.reqMessage = "妻子的请求是:"+_reqMessage;
                break;
            case 3:
                this.reqMessage = "母亲的请求是:"+_reqMessage;
                break;
        }
    }

    public String getMessage() {
        return this.reqMessage;
    }

    public int getType() {
        return this.type;
    }
}
