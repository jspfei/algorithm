package design.factory;

/**
 * Created by Administrator on 2018/4/12.
 */
public class YellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄色人会笑");
    }

    @Override
    public void cry() {
        System.out.println("黄色人会哭");
    }

    @Override
    public void talk() {
        System.out.println("黄色人会说话");
    }
}
