package design.facade;

/**
 * Created by Administrator on 2018/4/16.
 */
public class LetterProcessImpl implements LetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容 ... "+context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写信封地址 ... "+address);
    }

    @Override
    public void letterInotoEnvelope() {
        System.out.println("信放入信封中");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮寄信件");
    }
}
