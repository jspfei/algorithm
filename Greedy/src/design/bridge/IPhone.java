package design.bridge;

/**
 * Created by Administrator on 2018/4/19.
 */
public class IPhone extends Product {
    @Override
    public void beProducted() {
        System.out.println("IPhone 生产出来。。");
    }

    @Override
    public void beSelled() {
        System.out.println("IPhone卖出去。。");
    }
}
