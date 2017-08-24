package com.example.Array;

import java.util.Scanner;

/**
 * Created by dlancer on 2017/8/5.
 * 题目： 合唱团（网易编程题）

 有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生，
 要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？

 **输入描述:
 每个输入包含 1 个测试用例。每个测试数据的第一行包含一个整数 n (1 <= n <= 50)，表示学生的个数，
 接下来的一行，包含 n 个整数，按顺序表示每个学生的能力值 ai（-50 <= ai <= 50）。接下来的一行包含
 两个整数，k 和 d (1 <= k <=10, 1 <= d <= 50)。

 **输出描述
 输出一行表示最大的乘积

 **输入例子:
 3
 7 4 7
 2 50

 输出例子:
 49
 */

public class ComputeMaxProduct {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=0 , k=0, d=0;
        int[] array = null;

        while(cin.hasNextInt())
        {
            n = cin.nextInt();
            array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = cin.nextInt();
            }
            k = cin.nextInt();
            d = cin.nextInt();
        }

        //递归
        System.out.println(computeBestK(array, k , d));
        //动态规划
    }

    //以下为递归的方法
    public static long computeBestK(int[] array, int k, int d) {

        if(array.length == 0 || k == 0 || d ==0)
            return 0;
        if(array.length == 1 && k == 1 )
            return array[0];

        if(array.length >1 && k >=1 )
        {
            long max = Long.MIN_VALUE;

            //从k-1开始依次作为最后一项，计算最大的值。
            for (int i = k-1; i < array.length; i++) {
                long maxEndByCurrent = computeMaxEndBy(array, k, d, i);
                if( max < maxEndByCurrent)
                    max = maxEndByCurrent;
            }
            return max;

        }
        else
        {
            System.out.println("input case error");
            return -1;
        }
    }

    private static long computeMaxEndBy(int[] array, int k, int d, int end) {
        if(k == 1)
            return array[end];

        long max = Long.MIN_VALUE;

        for (int j = 1; j <= d && (end-j)>=0 &&  (end-j)>= (k-1)-1; j++) {
            //(end-j)>= (k-1)-1 是需要保证在向前寻找的时候，结尾元素之前至少还需要有k-1个元素，否则元素数目不够
            long res1 = array[end] * computeMaxEndBy(array, k-1, d, end-j);   ;
            long res2 = array[end] * computeMinEndBy(array, k-1, d, end-j);

            long larger = res1 > res2 ? res1: res2;

            if(max < larger)
                max = larger;
        }

        return max;
    }

    private static long computeMinEndBy(int[] array, int k, int d, int end) {
        if(k == 1)
            return array[end];

        long min = Long.MAX_VALUE;
        for( int j =1 ; j <= d && (end-j)>=0 && (end-j)>= (k-1)-1; j++)
        //(end-j)>= (k-1)-1 是需要保证在向前寻找的时候，结尾元素之前至少还需要有k-1个元素，否则元素数目不够
        {
            long res1 = array[end] * computeMaxEndBy(array, k-1, d, end-j);   ;
            long res2 = array[end] * computeMinEndBy(array, k-1, d, end-j);

            long smaller = res1 < res2 ? res1: res2;

            if(min > smaller)
                min = smaller;
        }
        if( min == Long.MAX_VALUE)
            System.out.println("k"+k+"d"+d+"end"+end);

        return min;
    }

    //以下为动态规划的方法

}
