package com.example.Sort;

import java.util.Arrays;

/**
 * Created by dlancer on 2017/4/13.
 */

public class InsertSort {
    public static void main(String[] args){

        int[] a = {4,5,1,3,2,7,6,9,8,1,2,5,6,2,6};
        insertSort(a);
        System.out.print(Arrays.toString(a));
    }
    public static void insertSort(int[] a){

        for (int i = 1; i < a.length; i++) {//从第二个数开始插入
            int temp = a[i];
            int j=0;
            for (j = i; j >0; j--) {
                if (temp<a[j-1]){
                    a[j]=a[j-1];
                }else {
                    break;
                }
            }
            a[j]=temp;
        }
    }
}
