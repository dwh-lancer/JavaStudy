package com.example.Sort;

import java.util.Arrays;

/**
 * Created by dlancer on 2017/4/14.
 * 注意：如果数组中有相同的数，则需要temp<=a[high]；考虑等号
 */

public class QuickSort3 {
    public static void main(String[] args){
        int[] a = {5,1,2,3,4,8,7,9,2,1,3,5,4,6,8,1,2,7,9,2};
        quicksort(a,0,a.length-1);
        System.out.print(Arrays.toString(a));
    }
    public static int getMid(int[] a,int low,int high){
        int temp = a[low];
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
        return low;

    }
    public static void quicksort(int[] a,int low,int high){
        if (low<high){
            int mid = getMid(a,low,high);
            quicksort(a,low,mid-1);
            quicksort(a,mid+1,high);
        }

    }
}
