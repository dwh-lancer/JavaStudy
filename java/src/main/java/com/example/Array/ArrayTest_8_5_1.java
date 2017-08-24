package com.example.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by dlancer on 2017/4/20.
 */

public class ArrayTest_8_5_1 {
    public static void main(String[] args) {
    }


    public static int minNum(int[] a,int begin){
        int length = a.length-begin;
        if (length == 2){
            return Math.min(a[begin],a[begin+1]);
        }else {
            return Math.min(a[begin],minNum(a,begin+1));
        }
    }



    public static int numSingleLetter(char[] a){
        int num = 0;
        //使用键值对存a==2
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(hashMap.containsKey(a[i])){
                int value = hashMap.get(a[i]);
                hashMap.put(a[i],++value);
            }else {
                hashMap.put(a[i],1);
            }
        }
        Iterator ite = hashMap.entrySet().iterator();
        while (ite.hasNext()){
            Map.Entry entry = (Map.Entry) ite.next();
            int count = (int) entry.getValue();
            if (count%2==1){
                num++;
            }
        }
        return num;
    }
}
