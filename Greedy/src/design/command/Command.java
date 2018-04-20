package design.command;

/**
 * Created by Administrator on 2018/4/20.
 */
public abstract class Command {

    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();
    public abstract  void execute();
}
