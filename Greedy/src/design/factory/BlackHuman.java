package design.factory;

/**
 * Created by Administrator on 2018/4/12.
 */
public class BlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑色人会笑");
    }

    @Override
    public void cry() {
        System.out.println("黑色人会哭");
    }

    @Override
    public void talk() {
        System.out.println("黑色人会说话");
    }
}
