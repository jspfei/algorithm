package design.abstractfactory.humanFactory;

import design.abstractfactory.Human;
import design.abstractfactory.HumanEnum;

/**
 * Created by Administrator on 2018/4/13.
 */
public class MaleHumanFactory extends AbstractHumanFactory {

    //创建一个男性黑种人
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }

    //创建一个男性白种人
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    //创建一个男性黄种人
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }
}
