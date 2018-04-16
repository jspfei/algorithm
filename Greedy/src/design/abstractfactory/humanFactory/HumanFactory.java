package design.abstractfactory.humanFactory;

import design.abstractfactory.Human;

/**
 * Created by Administrator on 2018/4/13.
 */
public interface HumanFactory {
    //制造黄色人类
    public Human createYellowHuman();

    //制造一个白色人类
    public Human createWhiteHuman();

    //制造一个黑色人类
    public Human createBlackHuman();
}
