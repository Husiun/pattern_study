package bridgepattern;

/**
 * 抽象出来的工厂类
 *
 * @author Ying Xiong
 * @date 2018/1/15
 */
public abstract class Corp {
    //持有一个产品对象
    private Product product ;

    public Corp(Product product) {
        this.product = product;
    }

    /**
     * 开工厂的目的就是为了挣钱
     */
    protected void makeMoney(){
        //先生产
        this.product.produced();
        //然后把产品卖出去
        this.product.selled();
    }

}
