package design.bridge;

/**
 * Created by Administrator on 2018/4/19.
 */
public class HouseCorp extends Corp {

    public HouseCorp(House house) {
        super(house);
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }


}
