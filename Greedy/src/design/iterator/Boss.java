package design.iterator;

/**
 * Created by Administrator on 2018/4/21.
 */
public class Boss {
    public static void main(String[] args){
        IProject project = new Project();

        project.add("aaa",10,10000);
        project.add("bb",10,1002222);
        project.add("cc",12,1002222);

        for(int i=4;i<104;i++){
            project.add("第"+i+"个项目",i*5,i*1000000);
        }

        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()){
            IProject p = (IProject) projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
