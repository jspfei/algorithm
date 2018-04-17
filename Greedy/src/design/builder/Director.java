package design.builder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/4/17.
 */
public class Director {

    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getABenzModel() {
        this.sequence.clear();

        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

         /*
 * B型号的奔驰车模型，是先发动引擎，然后启动，然后停止，没有喇叭
 */
        public BenzModel getBBenzModel(){
            this.sequence.clear();

            this.sequence.add("engine boom");
            this.sequence.add("start");
            this.sequence.add("stop");

            this.benzBuilder.setSequence(this.sequence);
            return (BenzModel)this.benzBuilder.getCarModel();
        }

 /*
 * C型号的宝马车是先按下喇叭（炫耀嘛），然后启动，然后停止
 */
        public BMWModel getCBMWModel(){
            this.sequence.clear();

            this.sequence.add("alarm");
            this.sequence.add("start");
            this.sequence.add("stop");

            this.bmwBuilder.setSequence(this.sequence);
            return (BMWModel)this.bmwBuilder.getCarModel();
        }

 /*
 * D类型的宝马车只有一个功能，就是跑，启动起来就跑，永远不停止，牛叉
 */
        public BMWModel getDBMWModel(){
            this.sequence.clear();

            this.sequence.add("start");

            this.bmwBuilder.setSequence(this.sequence);
            return (BMWModel)this.benzBuilder.getCarModel();
        }
}
