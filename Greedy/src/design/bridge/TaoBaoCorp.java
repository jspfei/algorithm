package design.bridge;

/**
 * Created by Administrator on 2018/4/19.
 */
public class TaoBaoCorp extends Corp {

    public TaoBaoCorp(Product product) {
        super(product);
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("淘宝公司赚钱了。。");
    }
}
