package design.strategy;

/**
 * Created by Administrator on 2018/4/10.
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求孙国太开个绿灯，方行");
    }
}
