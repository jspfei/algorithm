package design.abstractfactory;

/**
 * Created by Administrator on 2018/4/13.
 */
public enum HumanEnum { //把世界上所有人类型都定义出来
    YelloMaleHuman("design.abstractfactory.yellowHuman.YellowMaleHuman"),

    YelloFemaleHuman("design.abstractfactory.yellowHuman.YellowFemaleHuman"),

    WhiteFemaleHuman("design.abstractfactory.whiteHuman.WhiteFemaleHuman"),

    WhiteMaleHuman("design.abstractfactory.whiteHuman.WhiteMaleHuman"),

    BlackFemaleHuman("design.abstractfactory.blackHuman.BlackFemaleHuman"),

    BlackMaleHuman("design.abstractfactory.blackHuman.BlackMaleHuman");

    private String value = "";

    //定义构造函数，目的是Data(value)类型的相匹配
    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}