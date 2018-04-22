package design.iterator;

/**
 * Created by Administrator on 2018/4/21.
 */
public interface IProject {
    //add
    public void add(String name,int num,int count);
    public String getProjectInfo();
    public IProjectIterator iterator();
}
