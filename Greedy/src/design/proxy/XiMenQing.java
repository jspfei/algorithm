package design.proxy;

/**
 * Created by Administrator on 2018/4/10.
 */
public class XiMenQing {
    public static void  main(String[] args){
        WangPo wangPo = new WangPo();
        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();

        JiaShi jiaShi = new JiaShi();
        WangPo wangPo1 = new WangPo(jiaShi);
        wangPo1.makeEyesWithMan();
        wangPo1.happyWithMan();
    }
}
