package design.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/13.
 */
public class Client {
    public static void main(String[] args){
        IShowVisitor showVisitor = new ShowVisitor();
        ITotalVisitor totalVisitor = new TotalVisitor();
        for(Employee emp: mockEmployee()){
           emp.accept(showVisitor);
           emp.accept(totalVisitor);
        }
        showVisitor.report();
        totalVisitor.totalSalary();
    }


    public static List<Employee> mockEmployee(){
        List<Employee> empList = new ArrayList<Employee>();

        CommonEmployee zhangsan = new CommonEmployee();
        zhangsan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
        zhangsan.setName("张三");
        zhangsan.setSalary(1800);
        zhangsan.setSex(Employee.MALE);
        empList.add(zhangsan);

        //产生李四这个员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("页面美工，审美素质太不流行了！");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);

        //再产生一个经理
        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上是负值，但是我会拍马屁呀");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);


        return empList;
    }
}
