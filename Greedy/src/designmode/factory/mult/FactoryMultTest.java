package designmode.factory.mult;

import designmode.factory.simple.SendFactory;
import designmode.factory.simple.Sender;

/**
 * Created by admin on 2018/4/11.
 */
public class FactoryMultTest {
    public static void main(String[] arg){
        MultSendFactory factory = new MultSendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }
}
