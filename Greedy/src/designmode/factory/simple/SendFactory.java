package designmode.factory.simple;

/**
 * 单个工厂模式
 * Created by admin on 2018/4/11.
 */
public class SendFactory {
    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            System.out.println("请输入正确的类型：");
            return null;
        }
    }
}
