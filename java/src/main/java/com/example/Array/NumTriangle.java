package com.example.Array;

import java.util.Scanner;

/**
 * Created by dlancer on 2017/8/5.
 * 数字三角形
 *
 * 在下面的数字三角形中寻找一条从顶部到底边的路径，使得路径上所经过的数字之和最大。
 * 路径上的每一步都只能往左下或 右下走。只需要求出这个最大和即可，不必给出具体路径。
 * 三角形的行数大于1小于等于100，数字为 0 - 99

 输入格式：

 5      //表示三角形的行数    接下来输入三角形

 7

 3   8

 8   1   0

 2   7   4   4

 4   5   2   6   5

 要求输出最大和
 */

public class NumTriangle {
    static int n=0;
    static int[][] maxSum;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            n = sc.nextInt();
            int[][] a=new int[n][n];
            maxSum = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.print(maxSum(a,0,0));
        }
    }
    //此方法为递归的方法
    //maxSum(i,j)表示a[i][j]到底部最大的和。
    public static int maxSum(int[][] a,int i,int j){
        if(i==(n-1)){
            maxSum[i][j] = a[i][j];
        }else {
            maxSum[i][j]=a[i][j]+Math.max(maxSum(a,i+1,j),maxSum(a,i+1,j+1));
        }
        return maxSum[i][j];
    }
    //此方法为动态规划方法
    //maxSum[i][j]表示a[i][j]到底部最大的和。
    public static int maxSumDP(int[][] a,int i,int j){
        if(i==(n-1)){
            return a[i][j];
        }else {
            return a[i][j]+Math.max(maxSum(a,i+1,j),maxSum(a,i+1,j+1));
        }
    }
}
