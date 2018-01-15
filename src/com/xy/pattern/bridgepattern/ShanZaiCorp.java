package bridgepattern;

/**
 * 定义山寨公司
 *
 * @author Ying Xiong
 * @date 2018/1/15
 */
public class ShanZaiCorp extends Corp{
    public ShanZaiCorp(Product product) {
        super(product);
    }

    @Override
    protected void makeMoney() {
        super.makeMoney();
        System.out.println("山寨公司也在赚钱呢，，，");
    }
}
