package com.example.Array;

import java.util.Scanner;

/**
 * Created by dlancer on 2017/8/12.
 */

public class WangYiDuiQiZi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] point = new long[n][2];
        while (sc.hasNext()){
            for (int i = 0; i < n; i++) {
                point[i][0] = sc.nextLong();
            }
            for (int j = 0; j < n; j++) {
                point[j][1] = sc.nextLong();
            }
        }
        long[][] twoPointDis = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                twoPointDis[i][j] = getDistance(point[i][0],
                        point[i][1],point[j][0],point[j][1]);
            }
        }
    }
    public static long getDistance(long x1,long y1,long x2,long y2){
        return Math.abs((x2-x1)+(y2-y1));
    }
    public static void printResult(int n){
        System.out.print(0);
        for (int i = 2; i <= n; i++) {

        }
    }
}
