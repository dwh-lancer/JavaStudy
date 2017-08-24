package com.example.Sort;

/**
 * Created by dlancer on 2017/4/12.
 */

public class MergeSort2 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,1,2,3,4};
        int len = a.length;
        sort(a,0,len-1);
        for (int i = 0; i < len; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void sort(int[] arr,int low,int high){
        int mid = (low+high)/2;
        if (low<high){
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    public static void merge(int[] a,int low,int mid,int high){
        int i = low;
        int j = mid+1;
        int k = 0;//
        int[] temp = new int[high-low+1];//暂存数组的长度！
        while (i<=mid && j<=high){
            if (a[i]<=a[j]){
                temp[k++]=a[i++];
            }else {
                temp[k++]=a[j++];
            }
        }
        while (i<=mid){
            temp[k++]=a[i++];
        }
        while (j<=high){
            temp[k++]=a[j++];
        }
        //将temp赋值给a[]
        for (int k2 = 0; k2 < temp.length; k2++) {
            a[k2+low]=temp[k2];
        }
    }
}
