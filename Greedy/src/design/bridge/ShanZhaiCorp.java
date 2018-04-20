package design.bridge;

/**
 * Created by Administrator on 2018/4/19.
 */
public class ShanZhaiCorp extends Corp {
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}
