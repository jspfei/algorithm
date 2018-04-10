package design.strategy;

/**
 * Created by Administrator on 2018/4/10.
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，拦截追兵");
    }
}
