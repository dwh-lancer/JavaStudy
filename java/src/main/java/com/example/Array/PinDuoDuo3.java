package com.example.Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dlancer on 2017/8/17.
 */

public class PinDuoDuo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int hLen= sc.nextInt();
            int[] h = new int[hLen];
            for (int i = 0; i < hLen; i++) {
                h[i] = sc.nextInt();
            }
            int wLen= sc.nextInt();
            int[] w = new int[wLen];
            for (int i = 0; i < wLen; i++) {
                w[i] = sc.nextInt();
            }
            getResult(h,w);
        }

    }
    public static void getResult(int[] h,int[] w){
        Arrays.sort(h);
        Arrays.sort(w);
        int count = 0;
        int jBegin = h.length-1;
        for (int i = w.length-1; i >=0 ; i--) {
            for (int j = jBegin; j >=0; j--) {
                if (w[i]>=h[j]){
                    count++;
                    jBegin = j-1;
                    break;
                }
            }
        }
        System.out.print(count);
    }
}
