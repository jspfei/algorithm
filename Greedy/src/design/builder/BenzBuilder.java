package design.builder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/4/17.
 */
public class BenzBuilder extends CarBuilder{
    private BenzModel benz = new BenzModel();

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }
}
