package design.facade;

/**
 * Created by Administrator on 2018/4/16.
 */
public interface LetterProcess {
    public void writeContext(String context);
    public void fillEnvelope(String address);
    public void letterInotoEnvelope();
    public void sendLetter();
}
