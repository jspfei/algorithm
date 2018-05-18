package design.observer;

import com.sun.jmx.snmp.internal.SnmpSubSystem;

import java.util.Observable;

/**
 * Created by Administrator on 2018/4/24.
 */
public class HanFiZi extends Observable {

    public void haveBreakfast(){
        System.out.println("韩非子：开始吃饭了...");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");

    }
    public void  haveFun(){
        System.out.println("韩非子：开始娱乐了。。。");
        super.clearChanged();
        super.notifyObservers("韩非子在娱乐");
    }

}
