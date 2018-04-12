package design.singleton;

/**
 * Created by Administrator on 2018/4/12.
 */
public class Emperor {
    private static Emperor ourInstance = new Emperor();

    public static Emperor getInstance() {
        return ourInstance;
    }

    private Emperor() {
    }
    public void emperorInfo(){
        System.out.println("我是国王");
    }
}
