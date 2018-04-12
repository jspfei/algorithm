package design.mulsingleton;

/**
 * Created by Administrator on 2018/4/12.
 */
public class MMinister {

    public static void  main(String[] args){
        int ministerNum = 10;
        for(int i = 0 ;i<ministerNum;i++){
            MEmperor emperor = MEmperor.getInstance();
            System.out.println("第"+(i+1)+"位大臣参拜的是：");
            emperor.emperorInfo();
        }
    }
}
