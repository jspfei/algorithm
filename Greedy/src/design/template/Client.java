package design.template;

/**
 * Created by Administrator on 2018/4/16.
 */
public class Client {
    public static void main(String[] args){
        HummerH1Model h1 = new HummerH1Model();
        h1.setAlarm(true);
        h1.run();

        HummerH2Model h2 = new HummerH2Model();
        h2.run();
    }
}
