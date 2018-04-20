package design.bridge;

/**
 * Created by Administrator on 2018/4/19.
 */
public class IPod extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的iPod是这个样子的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的iPod是这个样子的...");
    }
}
