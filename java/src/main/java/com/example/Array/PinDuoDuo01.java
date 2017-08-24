package com.example.Array;

import java.util.Scanner;

/**
 * Created by dlancer on 2017/8/17.
 */

public class PinDuoDuo01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        while (sc.hasNext()){
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
        }
        getResult(a,m,n);
    }
    public static void getResult(int[][] a,int m ,int n){
        //用b[]存储每行的1的个数，然后在排序。输出下标
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j]==0 && a[i][j+1]==1 && j+1<n){
                    b[i] = 5-j-1;
                    break;
                }
            }
        }
      //找到b中首次出现的最大的数,和下标
        int max = b[0];
        int maxNum = 0;
        for (int i = 1; i < m; i++) {
            if (b[i]>max){
                max = b[i];
                maxNum = i;
            }
        }
        System.out.print("["+(maxNum+1)+","+max+"]");
        //剩下中最大数
        for (int i = maxNum+1; i < m; i++) {
            if (b[i]== max){
                System.out.print("["+(i+1)+","+b[i]+"]");
            }
        }
    }
}
