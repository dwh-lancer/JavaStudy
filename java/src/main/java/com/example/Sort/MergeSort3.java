package com.example.Sort;

import java.util.Arrays;

/**
 * Created by dlancer on 2017/4/14.
 */

public class MergeSort3 {
    public static void main(String[] args){

        int[] a = {4,2,2,6,9,4,1,3,7,2,8,6,4,1,2,8,5,3,9,7,6,4};
        sort(a,0,a.length-1);
        System.out.print(Arrays.toString(a));
    }

    /**
     * 分离序列
     * @param a
     */
    public static void sort(int[] a,int low,int high){
        int mid = (low+high)/2;
        if (low<high){
            sort(a,low,mid);//左边
            sort(a,mid+1,high);//右边
            merge(a,low,mid,high);
        }
    }

    /**
     * 将序列分成两部分，前面总是小于后面的
     * merge负责将两部分进行合并
     */
    public static void merge(int[] a,int low,int mid,int high){
     //定义一个int[] temp，存放排序后的两部分
        int[] temp = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int k = 0;
        while (i<=mid && j<=high){
            if (a[i]<=a[j]){//取小的
                temp[k++] = a[i++];
            }else {
                temp[k++] = a[j++];
            }
        }
        while (i<=mid){
            temp[k++] = a[i++];
        }
        while (j<=high){
            temp[k++] = a[j++];
        }
        for (int k2 = 0; k2 < temp.length; k2++) {
            a[low+k2] = temp[k2];
        }
    }
}
