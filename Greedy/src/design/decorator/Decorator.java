package design.decorator;

/**
 * Created by Administrator on 2018/4/20.
 */
public abstract class Decorator extends SchoolReport {
    private SchoolReport sr;
    public Decorator(SchoolReport sr){
        this.sr= sr;
    }
    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
