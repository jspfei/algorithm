package designmode.factory.statics;

import designmode.factory.simple.MailSender;
import designmode.factory.simple.Sender;
import designmode.factory.simple.SmsSender;

/**多个工厂模式
 * Created by admin on 2018/4/11.
 */
public class StaticSendFactory {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
