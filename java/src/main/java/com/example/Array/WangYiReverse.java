package com.example.Array;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by dlancer on 2017/8/14.
 */

public class WangYiReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        while (sc.hasNext()){
            for (int i = 0; i < a.length; i++) {
                a[i]= sc.nextInt();
            }
        }
        getResult(a);
    }
    //时间慢，不符合要求
    public static void getResult(int[] a){
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            b.add(a[i]);
            Collections.reverse(b);
        }
        for (int i = 0; i < b.size()-1; i++) {
            System.out.print(b.get(i)+" ");
        }
        System.out.print(b.get(b.size()-1));
    }

    public static void getResult2(int[] a){
        if (a.length%2==1){
            for (int i = a.length-1; i >=0 ; i-=2) {
                System.out.print(a[i]+" ");
            }
            for (int i = 1; i < a.length-3; i+=2) {
                System.out.print(a[i]+" ");
            }
            System.out.print(a[a.length-2]);
        }
        if (a.length%2==0){
            for (int i = a.length-1; i >=0 ; i-=2) {
                System.out.print(a[i]+" ");
            }
            for (int i = 0; i < a.length-3; i+=2) {
                System.out.print(a[i]+" ");
            }
            System.out.print(a[a.length-2]);
        }
    }
}
