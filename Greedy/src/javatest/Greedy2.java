package javatest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ［最大整数］设有n个正整数，将它们连接成一排，组成一个最大的多位整数。
 例如：n=3时，3个整数13，312，343，连成的最大整数为34331213。
 又如：n=4时，4个整数7，13，4，246，连成的最大整数为7424613。
 输入：n
 N个数
 输出：连成的多位数
 算法分析：此题很容易想到使用贪心法，在考试时有很多同学把整数按从大到小的顺序连接起来，测试题目的例子也都符合，但最后测试的结果却不全对。按这种标准，我们很容易找到反例：12，121应该组成12121而非12112，那么是不是相互包含的时候就从小到大呢？也不一定，如12，123就是12312而非12123，这种情况就有很多种了。是不是此题不能用贪心法呢？
 其实此题可以用贪心法来求解，只是刚才的标准不对，正确的标准是：先把整数转换成字符串，然后在比较a+b和b+a，如果a+b>=b+a，就把a排在b的前面，反之则把a排在b的后面。
 */
public class Greedy2 {
    public static void main(String[] args){
        String str = "";
        ArrayList<String> array = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the number of data:");
        int n = in.nextInt();
        System.out.println("Please input the data:");
        while (n-- > 0) {
            array.add(in.next());
        }
        for(int i = 0; i < array.size(); i ++)
            for(int j = i + 1; j < array.size(); j ++){
                if((array.get(i) + array.get(j)).compareTo(array.get(j) + array.get(i)) < 0){
                    String temp = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, temp);
                }
            }
        for(int i = 0; i < array.size(); i ++){
            str += array.get(i);
        }
        System.out.println("str=:"+str);
    }

}
