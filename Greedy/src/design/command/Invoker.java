package design.command;

/**
 * Created by Administrator on 2018/4/20.
 */
public class Invoker {
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void action(){
        this.command.execute();
    }
}
