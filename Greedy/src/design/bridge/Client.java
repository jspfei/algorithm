package design.bridge;

/**
 * Created by Administrator on 2018/4/19.
 */
public class Client {
    public static void main(String[] args){
        House house = new House();
        System.out.println("房产公司运行....");
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();
        System.out.println("\n");

        System.out.println("山寨公司....");
        //ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
        //ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
         TaoBaoCorp taoBaoCorp = new TaoBaoCorp(new IPhone());
        taoBaoCorp.makeMoney();
    }
}
