package com.example.Array;

import java.util.Scanner;



public class ArrayTest_8_5_10 {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = 0;//数组的长度
//        int[] arr = null;
//        while (sc.hasNext()){
//            n = sc.nextInt();
//            arr = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
//        }
        int[] arr = {1,5,4,7,6,8};
        System.out.print(maxNum(arr,0));
    }

    public static int maxNum(int[] arr,int begin){
        int length = arr.length-begin;
        if (length==1){
            return arr[begin];
        }else {
            return Math.max(arr[begin],maxNum(arr,begin+1));
        }
    }
}
