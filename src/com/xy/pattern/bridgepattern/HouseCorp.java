package bridgepattern;

/**
 * 房地产公司类
 *
 * @author Ying Xiong
 * @date 2018/1/15
 */
public class HouseCorp extends Corp{

    public HouseCorp(House house) {
        super(house);
    }

    @Override
    protected void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚钱了，，，");
    }
}
