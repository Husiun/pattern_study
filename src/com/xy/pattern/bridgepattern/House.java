package bridgepattern;

/**
 * 具体的产品
 *
 * @author Ying Xiong
 * @date 2018/1/15
 */
public class House extends Product {

    @Override
    public void produced() {
        System.out.println("房子建造出来了，，，");
    }

    @Override
    public void selled() {
        System.out.println("把房子卖出去了，，，");
    }
}
