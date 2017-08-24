package com.example.Sort;

import java.util.Arrays;

/**
 * Created by dlancer on 2017/4/12.
 */

public class QuickSort2 {
    public static void main(String args[]){
        int[] a = {1,7,6,5,4,3,2,1};
        quick(a,0,a.length-1);
        System.out.print(Arrays.toString(a));
    }


    public static void quick(int[] a,int low,int high){
        if (low<high){
           int mid = getMid(a,low,high);
            quick(a,low,mid-1);
            quick(a,mid+1,high);
        }
    }

    /**
     * 把数组分两部分，前一部分总是不大于后一部分。
     * @param a
     * @param low
     * @param high
     * @return 返回中轴的位置
     */
    public static int getMid(int[] a,int low,int high){
        int temp = a[low];//在这里出错了
        while (low<high){
            while (low<high && temp<=a[high]){
                high--;
            }
            a[low]=a[high];
            while (low<high && temp>=a[low]){
                low++;
            }
            a[high]=a[low];
        }
        a[low]=temp;
        return  low;
    }
}
