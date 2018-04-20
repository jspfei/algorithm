package design.command;

/**
 * Created by Administrator on 2018/4/20.
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        this.pg.find();
        this.pg.delete();
        this.pg.plan();
    }
}
