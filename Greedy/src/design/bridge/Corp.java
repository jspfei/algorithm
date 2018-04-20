package design.bridge;

/**
 * Created by Administrator on 2018/4/19.
 */
public abstract class Corp {
    private Product product;

    public Corp(Product product){
        this.product = product;
    }

    public void makeMoney(){
        this.product.beProducted();
        this.product.beSelled();
    }

}
