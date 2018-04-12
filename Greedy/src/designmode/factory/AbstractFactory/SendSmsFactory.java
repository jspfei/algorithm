package designmode.factory.AbstractFactory;

import designmode.factory.simple.Sender;
import designmode.factory.simple.SmsSender;

/**
 * Created by admin on 2018/4/11.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
