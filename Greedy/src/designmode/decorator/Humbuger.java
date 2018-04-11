package designmode.decorator;

/**
 * Created by admin on 2018/4/10.
 */
public abstract class Humbuger {
    protected String name;
    public String getName(){
        return  name;
    }

    public abstract double getPrice();
}
