package designmode.factory.AbstractFactory;

import designmode.factory.simple.Sender;

/**
 * Created by admin on 2018/4/11.
 */
public interface Provider {
    public Sender produce();
}
