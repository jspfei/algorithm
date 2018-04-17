package design.builder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/4/17.
 */
public class Client {
    public static void main(String[] args) {
 /*
 * 客户告诉牛叉公司，我要这样一个模型，然后牛叉公司就告诉我老大
 * 说要这样一个模型，这样一个顺序，然后我就来制造
 */
         Director director = new Director();

         for(int i = 0; i<100;i++){
             director.getABenzModel().run();
         }

         for(int i = 0;i<10;i++){
             director.getBBenzModel().run();
         }

         for(int i = 0; i<1000;i++){
             director.getCBMWModel().run();
         }

    }

}
