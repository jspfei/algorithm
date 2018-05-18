package design.visitor;

/**
 * Created by Administrator on 2018/5/12.
 */
public abstract class Employee {
    public final static int MALE = 0;
    public final static int FEMALE =1 ;

    private String name;
    private int salary;
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
    //允许一个访问者过来访问
    protected abstract void accept(IVisitor visitor);
}
