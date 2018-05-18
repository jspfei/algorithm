package design.observer;

import java.util.Observer;

/**
 * Created by Administrator on 2018/4/24.
 */
public class Client {

 public static void main(String args[]){
  Observer liSi = new LiSi();
  Observer liuSi = new LiuSi();

  //定义出韩非子
  HanFiZi hanFeiZi = new HanFiZi();

  //我们后人根据历史，描述这个场景，有三个人在观察韩非子
  hanFeiZi.addObserver(liSi);
  hanFeiZi.addObserver(liuSi);

  //然后这里我们看看韩非子在干什么
  hanFeiZi.haveBreakfast();
 }

}
