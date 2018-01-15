package bridgepattern;

/**
 * 抽象出的产品类
 *
 * @author Ying Xiong
 * @date 2018/1/15
 */
public abstract class Product {
    /**
     * 产品类就两个方法，生产和卖
     */
    public abstract void produced();

    public abstract void selled();
}
