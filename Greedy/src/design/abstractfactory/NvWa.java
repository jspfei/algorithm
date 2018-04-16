package design.abstractfactory;

import design.abstractfactory.humanFactory.FemaleHumanFactory;
import design.abstractfactory.humanFactory.HumanFactory;
import design.abstractfactory.humanFactory.MaleHumanFactory;

/**
 * Created by Administrator on 2018/4/13.
 */
public class NvWa {
    public static void main(String[] args) {

        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleHumanFactory();

        //第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleHumanFactory();

        //生产线建立完毕，开始生产人了:
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();

        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        maleYellowHuman.cry();
        maleYellowHuman.laugh();
        femaleYellowHuman.sex();
 /*
 * .....
 * 后面你可以续了
 */

}
}
