package com.example.Sort;

import java.util.Arrays;

/**
 * Created by dlancer on 2017/4/14.
 */

public class ShellSort2 {
    public static void main(String[] args){
        int[] a = {49,38,65,97,76,13,27,49,55,04};
        shellSort(a);
        System.out.print(Arrays.toString(a));

    }
    public static void shellSort(int[] a){
        //首先是increment
        for (int increment = a.length/2; increment > 0; increment /= 2) {
            //从i = incerment开始，依次和i-increment比较。
            for (int i = increment; i < a.length; i++) {
                int temp = a[i];
                int j = i;
//                for (j = i; j >=increment; j-=increment) {
//                    if (temp<a[j-increment]){
//                        a[j]=a[j-increment];
//                    }else {
//                        break;
//                    }
//                }
                while (j >= increment) {
                    if (temp < a[j - increment]) {
                        a[j] = a[j - increment];
                        j -= increment;
                    } else {
                        break;
                    }
                }
                a[j] = temp;
            }
        }
    }
}
