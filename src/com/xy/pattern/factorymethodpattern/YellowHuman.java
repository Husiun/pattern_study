package factorymethodpattern;

/**
 * 黄色人种
 *
 * @author Ying Xiong
 * @date 2018/1/10
 */
public class YellowHuman implements Human {
    /**
     * 重写方法
     */
    @Override
    public void say() {
        System.out.println("黄色人种说话，，，");
    }

    @Override
    public void laugh() {
        System.out.println("黄色人种笑，，，");
    }

    @Override
    public void cry() {
        System.out.println("黄色人种哭，，，");
    }
}
