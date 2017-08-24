package com.example.Array;

import java.util.Arrays;

/**
 * Created by dlancer on 2017/8/17.
 */

public class PinDuoDuo04 {
    /**
     *
     * @param a1 数组1
     * @param a2 数组2
     * @param a3 数组3
     * @param l1 数组1长度
     * @param l2 数组2长度
     * @param l3 数组3长度
     */
    public static void intreval(int a1[],int a2[],int a3[],int l1,int l2,int l3)
    {
        int l=l1+l2+l3;
        int[] b = new int[l1+l2+l3];
        for(int i=0;i<l1;i++)
            b[i]=a1[i];
        for(int i=l1;i<l1+l2;i++)
            b[i]=a2[i-l1];
        for(int i=l1+l2;i<l1+l2+l3;i++)
            b[i]=a3[i-l1-l2];
        Arrays.sort(b);
        int k=0;
        while(b[k]<a1[l1-1]&&b[k]<a2[l2-1]&&b[k]<a3[l3-1])
        {
            k++;
        }
        int min=b[k];
        while(b[l-1]>a1[0]&&b[l-1]>a2[0]&&b[l-1]>a3[0])
        {
            l--;
        }
        int max=b[l];
        System.out.print("["+min+","+max+"]");
    }

}
