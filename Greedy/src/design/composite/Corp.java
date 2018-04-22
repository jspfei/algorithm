package design.composite;

/**
 * Created by Administrator on 2018/4/22.
 */
public abstract class Corp {
    private String name ="";
    private String position = "";
    private int salary = 0;

    public String getName() {
        return name;
    }
    private Corp parent;

    public Corp (String _name,String _positon,int _salary){
        this.name = _name;
        this.position = _positon;
        this.salary = _salary;
    }


    public String getInfo(){
        String info = "";

        info = "姓名："+this.name;
        info = info + "\t职位："+this.position;
        info = info +"\t工资："+this.salary;
        return info;
    }

    public void setParent(Corp corp){
        this.parent = corp;
    }

    public Corp getParent(){
        return this.parent;
    }
}
