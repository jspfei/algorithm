package design.composite;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/4/22.
 */
public class Branch extends Corp {

    ArrayList<Corp> subordinateList = new ArrayList<Corp>();

    public Branch(String _name, String _positon, int _salary) {
        super(_name, _positon, _salary);
    }

    public void addSubOrdiante(Corp corp){
        corp.setParent(this);
        this.subordinateList.add(corp);
    }
    public ArrayList<Corp> getSubordinateList(){
        return this.subordinateList;
    }
}
