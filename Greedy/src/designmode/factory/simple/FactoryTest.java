package designmode.factory.simple;

/**
 * Created by admin on 2018/4/11.
 */
public class FactoryTest {
    public static void main(String[] arg){
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }
}
