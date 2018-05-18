package design.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2018/4/24.
 */
public class LiuSi implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("刘斯：观察到韩非子活动，开始动作。。。");
        this.happy(arg.toString());
        System.out.println("刘斯开心死了");
    }
    private void happy(String context){
        System.out.println("刘斯：因为"+context+"，开始高兴了");
    }
}
