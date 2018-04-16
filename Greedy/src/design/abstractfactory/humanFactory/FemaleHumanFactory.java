package design.abstractfactory.humanFactory;

import design.abstractfactory.Human;
import design.abstractfactory.HumanEnum;

/**
 * Created by Administrator on 2018/4/13.
 */
public class FemaleHumanFactory extends AbstractHumanFactory {

    //创建一个女性黑种人
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }

    //创建一个女性白种人
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    //创建一个女性黄种人
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloFemaleHuman);
    }
}
