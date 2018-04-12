package designmode.factory.AbstractFactory;

import designmode.factory.simple.Sender;

/**
 * Created by admin on 2018/4/11.
 */
public class AbstactFactoryTest {
    public static void main(String[] arg){
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();

        Provider provider1 = new SendSmsFactory();
        Sender sender1 = provider1.produce();
        sender1.Send();
    }
}
