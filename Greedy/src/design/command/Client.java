package design.command;

/**
 * Created by Administrator on 2018/4/20.
 */
public class Client {
    public static void main(String[] arg){
        //定义我们的接头人
        Invoker xiaoSan = new Invoker(); //接头人就是我小三

        //客户要求增加一项需求
        System.out.println("-------------客户要求删除一页需求-----------------");
        //客户给我们下命令来
       // Command command = new AddRequirementCommand();
        Command command = new DeletePageCommand();

        //接头人接收到命令
        xiaoSan.setCommand(command);

        //接头人执行命令
        xiaoSan.action();
    }
}
