package designmode.decorator;

/**
 * Created by admin on 2018/4/10.
 */
public class Decorator_zero extends Decorator {
    public Decorator_zero(Human human) {
        super(human);
    }

    public void goHome(){
        System.out.println("进房子....");
    }

    public void findMap(){
        System.out.print("书房找找Map....");
    }
    @Override
    public void wearClothes(){
        super.wearClothes();
        goHome();
    }
    @Override
    public void walkToWhere(){
        super.walkToWhere();
        findMap();
    }
}
