package design.bridge;

/**
 * Created by Administrator on 2018/4/19.
 */
public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的房子是这个样子....");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去了....");
    }
}
