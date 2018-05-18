package design.composite;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/4/22.
 */
public class Client {

    public static void main(String[] args) {
        //组合树
        Branch ceo = compositeCorpTree();
        //获取ceo
        System.out.println(ceo.getInfo());
        //获取所有员工信息
        System.out.println(getTreeInfo(ceo));

        String name = "赵三驼子";
        Corp wu = findCorp(name,ceo);
        if(wu instanceof Leaf){
            System.out.println(name +" 上司 ：\n"+wu.getParent().getName() +"\n" );
        }else{
            System.out.println(name +" 上司 ：\n"+wu.getParent().getName() +"\n" +name +"下属:\n"+ getTreeInfo((Branch) wu));
        }
    }

    private static Branch compositeCorpTree() {
        Branch root = new Branch("王大麻子", "总经理", 100000);

        //部门经理
        Branch developDep = new Branch("刘大瘸子","研发部门经理",10000);
        Branch salesDep = new Branch("马二拐子","销售部门经理",20000);
        Branch financeDep = new Branch("赵三驼子","财务部经理",30000);

        //再把三个小组长产生出来
        Branch firstDevGroup = new Branch("杨三乜斜","开发一组组长",5000);
        Branch secondDevGroup = new Branch("吴大棒槌","开发二组组长",6000);

        //把所有的小兵都产生出来
        Leaf a = new Leaf("a","开发人员",2000);
        Leaf b = new Leaf("b","开发人员",2000);
        Leaf c = new Leaf("c","开发人员",2000);
        Leaf d = new Leaf("d","开发人员",2000);
        Leaf e = new Leaf("e","开发人员",2000);
        Leaf f = new Leaf("f","开发人员",2000);
        Leaf g = new Leaf("g","开发人员",2000);
        Leaf h = new Leaf("h","销售人员",5000);
        Leaf i = new Leaf("i","销售人员",4000);
        Leaf j = new Leaf("j","财务人员",5000);
        Leaf k = new Leaf("k","CEO秘书",8000);
        Leaf zhengLaoLiu = new Leaf("郑老六","研发部副经理",20000);

        root.addSubOrdiante(k);
        root.addSubOrdiante(developDep);
        root.addSubOrdiante(salesDep);
        root.addSubOrdiante(financeDep);

        //研发部经理
        developDep.addSubOrdiante(zhengLaoLiu);
        developDep.addSubOrdiante(firstDevGroup);
        developDep.addSubOrdiante(secondDevGroup);



        //看看开发两个开发小组下有什么
        firstDevGroup.addSubOrdiante(a);
        firstDevGroup.addSubOrdiante(b);
        firstDevGroup.addSubOrdiante(c);
        secondDevGroup.addSubOrdiante(d);
        secondDevGroup.addSubOrdiante(e);
        secondDevGroup.addSubOrdiante(f);

        //再看销售部下的人员情况
        salesDep.addSubOrdiante(h);
        salesDep.addSubOrdiante(i);

        //最后一个财务
        financeDep.addSubOrdiante(j);

        return root;
    }

    public static String getTreeInfo(Branch root){
        ArrayList<Corp> subordinateList = root.getSubordinateList();
        String info = "";
        for(Corp s :subordinateList){
            if(s instanceof Leaf){
                info = info + s.getInfo()+"\n";
            }else{
                info = info + s.getInfo()+"\n"+getTreeInfo((Branch) s);
            }
        }

        return info;
    }

    public static Corp findCorp(String name,Branch root){
        ArrayList<Corp> all = root.getSubordinateList();
        Corp tag = null;
        for(Corp s : all){
            if(s.getName().equals(name)){
                tag =  s;
                break;
            }
            if(s instanceof  Branch){
                tag = findCorp(name, (Branch) s);
                if(tag !=null && tag.getName() .equals(name)){
                    break;
                }
            }
        }

        if(tag != null){
            return tag;
        }else{
            return null;
        }

    }

}