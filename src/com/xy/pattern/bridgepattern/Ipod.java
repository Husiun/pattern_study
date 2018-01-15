package bridgepattern;

/**
 * 畅销产品类之一
 *
 * @author Ying Xiong
 * @date 2018/1/15
 */
public class Ipod extends Product {

    @Override
    public void produced() {
        System.out.println("制造ipod");
    }

    @Override
    public void selled() {
        System.out.println("ipod卖出去");
    }
}
