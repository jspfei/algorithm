package design.proxy;

/**
 * Created by Administrator on 2018/4/10.
 */
public class JiaShi implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("贾氏抛媚眼");
    }

    @Override
    public void happyWithMan() {
        System.out.println("贾氏正在Happy中.....");
    }
}
