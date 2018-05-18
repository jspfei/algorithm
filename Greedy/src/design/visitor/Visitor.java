package design.visitor;

import sun.nio.cs.ext.MacGreek;

/**
 * Created by Administrator on 2018/5/13.
 */
public class Visitor implements IVisitor
{
    //部门经理的工资系数是5
    private final static int MANAGER_COEFFICIENT = 5;

    //员工的工资系数是2
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;

    //普通员工的工资总和
    private int commonTotalSalary = 0;

    //部门经理的工资总和
    private int managerTotalSalary =0;
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
        //计算普通员工的薪水总和
        this.calCommonSlary(commonEmployee.getSalary());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
        //计算部门经理的工资总和
        this.calManagerSalary(manager.getSalary());
    }

    private String getBasicInfo(Employee employee){
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.FEMALE?"女":"男")
                + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";

        return info;
    }

    private String getManagerInfo(Manager manager){
          String basicInfo = this.getBasicInfo(manager);
          String otherInfo = "业绩："+manager.getPerformance() +"\t";
          return basicInfo + otherInfo;
    }

    private String getCommonEmployee(CommonEmployee commonEmployee){
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作："+commonEmployee.getJob() +"\t";
        return basicInfo + otherInfo;
    }

    //计算部门经理的工资总和
    private void calManagerSalary(int salary){
        this.managerTotalSalary = this.managerTotalSalary + salary
                *MANAGER_COEFFICIENT ;
    }

    //计算普通员工的工资总和
    private void calCommonSlary(int salary){
        this.commonTotalSalary = this.commonTotalSalary +
                salary*COMMONEMPLOYEE_COEFFICIENT;
    }

    //获得所有员工的工资总和
    public int getTotalSalary(){
        return this.commonTotalSalary + this.managerTotalSalary;
    }
}
