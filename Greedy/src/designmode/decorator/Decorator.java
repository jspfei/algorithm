package designmode.decorator;

/**
 * Created by admin on 2018/4/10.
 */
public abstract  class Decorator implements Human{
    private Human human;

    public Decorator (Human human){
        this.human = human;
    }
    @Override
    public void wearClothes() {
        human.wearClothes();
    }

    @Override
    public void walkToWhere() {
        human.walkToWhere();
    }
}
