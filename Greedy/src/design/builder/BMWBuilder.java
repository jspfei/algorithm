package design.builder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/4/17.
 */
public class BMWBuilder  extends CarBuilder {
    private BMWModel bmw = new BMWModel();

    @Override
    public CarModel getCarModel(){
        return this.bmw;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

}
