package com.example.Array;

/**
 * Created by dlancer on 2017/4/20.
 * 找到数组中只出现一次的数字，其余数字都出现了两次。
 */

public class ArrayTest_8_5_8 {
    public static void main(String[] args){
        int a[] = {1,2,3,2,4,3,5,4,1};
        System.out.print(finNotDouble(a));
    }
    public static int finNotDouble(int a[]){
        int result = a[0];
        for (int i = 1; i < a.length; i++) {
            result ^=a[i];
        }
        return result;
    }
}
