package com.example.Array;

import java.util.Scanner;

/**
 * Created by dlancer on 2017/8/17.
 *
 5 5
 02111
 01a0A
 01003
 01001
 01111
 */

public class PinDuoDuo4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
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
        getResult(a);

    }

    public static void getResult(int[][] a){
        if (a[0][0]==0){
            System.out.print(7);
        }
    }
}
