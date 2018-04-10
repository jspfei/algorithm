package design.strategy;

/**
 * Created by Administrator on 2018/4/10.
 */
public class ZhaoYun {
    public static void  main(String[] args){
        Context context;

        System.out.println("----------刚到吴国拆第一个------------");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("\n\n\n\n\n\n");

        System.out.println("----------刘备乐不思蜀，拆第二个------------");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("\n\n\n\n\n\n");

        System.out.println("----------孙权追兵来了，拆第三个------------");
        context = new Context(new BlockEnemy());
        context.operate();
        System.out.println("\n\n\n\n\n\n");
    }
}
