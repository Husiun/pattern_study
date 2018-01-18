package chainofresponsibitypattern;

/**
 * 抽象类，
 *
 * @author Ying Xiong
 * @date 2018/1/18
 */
public abstract class Handler {
    //对应的级别
    private int level = 0;
    //流向的下一个
    private Handler nextHandler;

    public Handler(int _level) {
        this.level = _level;
    }

    //处理请求,在父类实现，是一个具体方法
    public final void handleMessagr(IWomen women){
        if(women.getType() == this.level){
            this.response(women);
        }else{
            //如果不是当前的级别处理的
            if(this.nextHandler != null){
                this.nextHandler.handleMessagr(women);
            }else{
                System.out.println("没有对应的处理人");

            }
        }
    }

    //具体方法，设置下一级别
    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }

    //抽象方法，需要子类自己实现
    public abstract void response(IWomen women);
}
