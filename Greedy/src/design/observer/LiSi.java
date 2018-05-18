package design.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2018/4/24.
 */
public class LiSi implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯：观察到韩非子活动，开始想秦始皇汇报了");
        this.reportToQiShiHuang(arg.toString());
        System.out.println("李斯：汇报完毕，秦始皇奖赏！");

    }

    private void reportToQiShiHuang(String reportContext) {
        System.out.println("李斯：报告，秦始皇！韩非子有活动了-->"+reportContext);
    }
}
