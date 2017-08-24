package com.example.Array;

import java.util.Arrays;

/**
 * Created by dlancer on 2017/4/20.
 *如何把一个数组循环右移k位。
 */

public class ArrayTest_8_5_6 {
    public static void main(String[] args){

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        rightMove(a,11,a.length);
    }

    /**
     * 缺点：又定义了一个数组int[] b；
     * @param a
     * @param k
     * @param len
     */
    public static void rightMove(int[] a,int k,int len){
        k %=len;
        int[] b = new int[len];
        for (int i = 0; i < len; i++) {
            if (i+k>=len){
                b[i+k-len]=a[i];
            }else {
                b[i+k] = a[i];
            }
        }
        System.out.print(Arrays.toString(b));
    }
}
