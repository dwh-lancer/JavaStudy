package com.example.Sort;

import java.util.Arrays;

/**
 * Created by dlancer on 2017/4/14.
 */

public class BubbleSort {
    public static void main(String[] args){

        int[] a={4,1,2,6,7,3,2,9,8,5};
        bubbleSort(a);
        System.out.print(Arrays.toString(a));
    }

    public static void bubbleSort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
               if (a[j]>a[j+1]){
                   int temp = a[j+1];
                   a[j+1] = a[j];
                   a[j] = temp;
               }

            }
        }
    }
}
