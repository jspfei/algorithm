package designmode.factory.AbstractFactory;

import designmode.factory.simple.MailSender;
import designmode.factory.simple.Sender;

/**
 * Created by admin on 2018/4/11.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
