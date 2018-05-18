package design.visitor;

/**
 * Created by Administrator on 2018/5/13.
 */
public interface IVisitor {
    public void visit(CommonEmployee commonEmployee);

    // 访问部门经理
    public void visit(Manager manager);
}
