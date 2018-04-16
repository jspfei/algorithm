package design.facade;

/**
 * Created by Administrator on 2018/4/16.
 */
public class Client {

    public static void main(String[] args){
        ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
        String address = "北京朝阳区时光大道101号";
        String context = "下一个版本快发布！！！！";
        hellRoadPostOffice.sendLetter(context,address);
    }
}
