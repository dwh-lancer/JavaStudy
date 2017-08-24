package com.example.Array.LianjiaWeb;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class LianjiaWeb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        while (sc.hasNext()) {
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
        }
        //先排序
        Arrays.sort(a);
        //去重,一次存入
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            if(!hashSet.contains(a[i])){
                hashSet.add(a[i]);
            }
        }
        System.out.println(hashSet.size());
        for (int b : hashSet) {
            System.out.print(b+" ");
        }
    }
}