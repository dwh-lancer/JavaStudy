package com.example.Sort;

import java.util.Arrays;

/**
 * Created by dlancer on 2017/4/13.
 */

public class SelectSort {
    public static void main(String[] args){

        int[] a = {5,6,8,3,1,9,4,2,7,6,5,3,4};
        selectSort(a);
        System.out.print(Arrays.toString(a));
    }
    public static void selectSort(int[] a){
        if (a==null){
            return;
        }
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int minNum = i;
            for (int j = i; j < a.length; j++) {
                if (min>a[j]){
                    min= a[j];
                    minNum=j;
                }
            }
            //a[minNum]和a[i]交换位置；
            int temp = a[minNum];
            a[minNum]= a[i];
            a[i]= temp;
        }
    }
}
