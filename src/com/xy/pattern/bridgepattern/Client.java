package bridgepattern;

/**
 * 测试类
 *
 * @author Ying Xiong
 * @date 2018/1/15
 */
public class Client {
    public static void main(String[] args) {
        ShanZaiCorp shanZaiCorp = new ShanZaiCorp(new Ipod());
        shanZaiCorp.makeMoney();

        HouseCorp houseCorp = new HouseCorp(new House());
        houseCorp.makeMoney();
    }
}
