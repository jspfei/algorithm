package design.singleton;

/**
 * Created by Administrator on 2018/4/12.
 */
public class Minister {
    public static void main(String[] args){
        Emperor emperor1 = Emperor.getInstance();
        emperor1.emperorInfo();

        Emperor emperor2 = Emperor.getInstance();
        emperor2.emperorInfo();

        Emperor emperor3 = Emperor.getInstance();
        emperor3.emperorInfo();
    }
}
