package designmode.factory.simple;

/**
 * Created by admin on 2018/4/11.
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailSender");
    }
}
