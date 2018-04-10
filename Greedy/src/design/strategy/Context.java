package design.strategy;

import sun.nio.cs.ext.ISCII91;

/**
 * Created by Administrator on 2018/4/10.
 */
public class Context {

    private IStrategy strategy;
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    public void operate(){
        this.strategy.operate();
    }
}
