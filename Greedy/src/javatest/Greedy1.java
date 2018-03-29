package javatest;

/**
 * Created by Administrator on 2017/12/25.
 */
import java.util.Scanner;


import java.util.ArrayList;

/**［均分纸牌］有N堆纸牌，编号分别为1，2，…，n。每堆上有若干张,但纸牌总数必为n的倍数.可以在任一堆上取若干张纸牌,然后移动。移牌的规则为：在编号为1上取的纸牌，只能移到编号为2的堆上；在编号为n的堆上取的纸牌，只能移到编号为n-1的堆上；其他堆上取的纸牌，可以移到相邻左边或右边的堆上。现在要求找出一种移动方法，用最少的移动次数使每堆上纸牌数都一样多。例如：n=4，4堆纸牌分别为：① 9 ② 8 ③ 17 ④ 6 移动三次可以达到目的：从③取4张牌放到④ 再从③区3张放到②然后从②去1张放到①。
 输入输出样例：4
 9 8 17 6
 屏幕显示：3
 算法分析：设a[i]为第I堆纸牌的张数（0<=I<=n），v为均分后每堆纸牌的张数，s为最小移动次数。
 我们用贪心算法，按照从左到右的顺序移动纸牌。如第I堆的纸牌数不等于平均值，则移动一次（即s加1），分两种情况移动：
 1．若a[i]>v，则将a[i]-v张从第I堆移动到第I+1堆；
 2．若a[i]<v，则将v-a[i]张从第I+1堆移动到第I堆。
 为了设计的方便，我们把这两种情况统一看作是将a[i]-v从第I堆移动到第I+1堆，移动后有a[i]=v; a[I+1]=a[I+1]+a[i]-v.
 在从第I+1堆取出纸牌补充第I堆的过程中可能回出现第I+1堆的纸牌小于零的情况。
 如n=3，三堆指派数为1 2 27 ，这时v=10，为了使第一堆为10，要从第二堆移9张到第一堆，而第二堆只有2张可以移，这是不是意味着刚才使用贪心法是错误的呢？
 我们继续按规则分析移牌过程，从第二堆移出9张到第一堆后，第一堆有10张，第二堆剩下-7张，在从第三堆移动17张到第二堆，刚好三堆纸牌都是10，最后结果是对的，我们在移动过程中，只是改变了移动的顺序，而移动次数不便，因此此题使用贪心法可行的。
 * */
public class Greedy1 {
    public static void main(String[] args) {
        int n = 0, avg =0, s = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        System.out.println("Please input the number of heaps:");
        n = scanner.nextInt();
        System.out.println("Please input heap number:");
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
        for(int i = 0; i < array.size(); i ++){
            avg += array.get(i);
        }
        avg = avg/array.size();
        System.out.println(array.size());
        System.out.println(avg);
        for(int i = 0; i < array.size()-1; i ++){
            s++;
            array.set(i+1, array.get(i+1)+array.get(i)-avg);
        }
        for(int i = 0;i<array.size()-1;i++){
              System.out.println(array.get(i)+"\t");
        }
        System.out.println("s:" + s);
    }

}
