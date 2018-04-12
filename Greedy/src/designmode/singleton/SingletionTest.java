package designmode.singleton;

import jdk.nashorn.internal.runtime.BitVector;

/**
 * Created by admin on 2018/4/11.
 */
public class SingletionTest  {
    private static SingletionTest instance = null;
    //影子实例 同步更新属性
    private BitVector properties= null;
    private BitVector getProperties(){
        return properties;
    }
    private SingletionTest(){}
    private static synchronized void syncInit(){
        if(instance == null){
            instance = new SingletionTest();
        }
    }

    public static SingletionTest getInstance(){
        if(instance == null){
            syncInit();
        }
        return instance;
    }
    //更新属性
    public void updateProperties(){
        SingletionTest shadow = new SingletionTest();
        properties = shadow.getProperties();
    }
}
