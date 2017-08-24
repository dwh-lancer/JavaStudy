package com.example.Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dlancer on 2017/8/14.
 */

public class WangYi01Str {
    public static void main(String[] args){

        int[] a={1,0,1,0,1,0,1};
        System.out.println(getResult(a));
    }
    public static int getResult(int[] a) {
        int maxCount = 0;
        int nowCount = 0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i+1]!=a[i]) {
                nowCount++;
            }else {
                maxCount = nowCount > maxCount ? nowCount:maxCount;
                nowCount=0;
            }

        }
        maxCount = nowCount > maxCount ? nowCount:maxCount;
        return maxCount+1;
    }
    public static void getResult2(int[] a){
        int maxLen = 1;
        int nowLen = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[1]!=a[i-1]){
                nowLen++;
                if (nowLen>maxLen){
                    maxLen = nowLen;
                }
            }else {
                nowLen = 1;
            }
        }
        System.out.print(maxLen);
    }
}
