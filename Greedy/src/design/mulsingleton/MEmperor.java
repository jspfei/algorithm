package design.mulsingleton;

import design.singleton.Emperor;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Administrator on 2018/4/12.
 */
public class MEmperor {
    private static int maxNumOfEmperor = 2;
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);

    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);
    private static int countNumOfEmperor = 0 ;
    static {
        for (int i = 0;i<maxNumOfEmperor;i++){
            emperorList.add(new MEmperor("皇"+(i+1)+"帝"));
        }
    }
    private MEmperor(){

    }
    private MEmperor(String info){
        emperorInfoList.add(info);
    }

    public  static MEmperor getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return (MEmperor) emperorList.get(countNumOfEmperor);
    }

    public static void emperorInfo(){
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }
}
