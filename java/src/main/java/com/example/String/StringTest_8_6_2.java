package com.example.String;

import java.util.Arrays;

/**
 * Created by dlancer on 2017/4/20.
 * 判断两个字符串是否由相同的字符组成（相同的字母和个数）
 */

public class StringTest_8_6_2 {
    public static void main(String[] args){
        copmpare("aaaabbc","bbcaaaa");
    }
    public static void copmpare(String s1,String s2){
//        byte[] b1 = s1.getBytes();
//        byte[] b2 = s2.getBytes();
//        Arrays.sort(b1);
//        Arrays.sort(b2);
//        s1 = new String(b1);
//        s2 = new String(b2);
//        System.out.print(s1+"\t"+s2);
        int[] a = {8,1,4,5,2,3,7,6,9};
        Arrays.sort(a);
        System.out.print(a);
    }
}
