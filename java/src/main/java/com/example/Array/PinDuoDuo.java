package com.example.Array;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dlancer on 2017/8/17.
 */

public class PinDuoDuo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        while (sc.hasNext()){
            for (int i = 0; i <n ; i++) {
                a[i]=sc.nextInt();
            }
        }
        getResult(a);
    }
    public static void getResult(long[] a){
        int len = a.length;
        Arrays.sort(a);

        long max = Math.max((a[len-1]*a[len-2]*a[len-3]),(a[len-1]*a[0]*a[1]));
        System.out.print(max);

        }
    }
