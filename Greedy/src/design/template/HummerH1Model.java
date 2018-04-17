package design.template;

/**
 * Created by Administrator on 2018/4/16.
 */
public class HummerH1Model extends HummerModel {

    private boolean alarmFlag  = true;
    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样在...");
    }

    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    public void setAlarm(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }

    @Override
    protected boolean isAlarm(){
        return this.alarmFlag;
    }


}
