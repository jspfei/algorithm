package designmode.factory.statics;

import designmode.factory.simple.SendFactory;
import designmode.factory.simple.Sender;

/**
 * Created by admin on 2018/4/11.
 */
public class FactoryStaticTest {
    public static void main(String[] args){
        Sender sender = StaticSendFactory.produceMail();
        sender.Send();
    }
}
