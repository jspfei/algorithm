package designmode.decorator;

/**
 * Created by admin on 2018/4/10.
 */
public class ChickenBurger  extends Humbuger{

    public ChickenBurger(){
        name = "鸡腿堡";
    }
    @Override
    public double getPrice() {
        return 0;
    }
}
