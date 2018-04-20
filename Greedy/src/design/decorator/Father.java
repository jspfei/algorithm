package design.decorator;

/**
 * Created by Administrator on 2018/4/20.
 */
public class Father {
    public static void main(String[] args) {
        //成绩单拿过来
        SchoolReport sr ;
        sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);

        //看成绩单
        sr.report();

        //签名？休想！
        sr.sign("老三");
    }
}
