package factorymethodpattern;

/**
 * 白色人种
 *
 * @author Ying Xiong
 * @date 2018/1/10
 */
public class WhiteHuman implements Human {
    /**
     * 重写方法
     */
    @Override
    public void say() {
        System.out.println("白色人种说话了，，，");
    }

    @Override
    public void laugh() {
        System.out.println("白色人种笑了，，，");
    }

    @Override
    public void cry() {
        System.out.println("白色人种哭了。。。");
    }
}
