package com.example.Array;

import java.util.Arrays;

/**
 * Created by dlancer on 2017/4/20.
 * 找出数组中两两相加等于20的组合种数
 */

public class ArrayTest_8_5_5 {
    public static void main(String[] args){
        int[]a={9,8,7,6,5,4,3,2,1,15,19,16,18,17,13,12,14,11,16,18};
        ArrayTest_8_5_5 t = new ArrayTest_8_5_5();
//        t.getCountOf20(a);
        t.getCountOf20_2(a);
        System.out.print(Arrays.toString(a));
    }

    /**
     *
     * @param a shuru
     * @return
     * 时间复杂度：由于采用了双重循环，因此时间复杂度为（O^2）
     */
    public int getCountOf20(int[] a){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]+a[j]==20){
                    count++;
                    System.out.print(a[i]+" "+a[j]+"\n");
                }
            }
        }
        return count;
    }


    /**
     * 采用快速排序，再
     * @param a
     */
    public void getCountOf20_2(int[] a){
        //首先对数组排序，然后计算alow+ahigh>(<)20？;若low+high<20,则需要low++；若low+high>20，则需要high--；
        int low = 0;
        int high = a.length-1;
        recurrence(a,low,high);
        while (low<high){
         if (a[low]+a[high]>20){
             high--;
         }else if (a[low]+a[high]<20){
             low++;
         }else {
             System.out.print(a[low]+"  "+a[high]+"\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
             high--;
             low++;
         }
        }
    }

    /**
     * 快速排序：分成两部分，使左侧不大于右侧
     * @param a
     */
    //递归调用
    public static void recurrence(int[] a,int low,int high){
        if (low<high){
            int mid = getMid(a,low,high);
            recurrence(a,low,mid-1);
            recurrence(a,mid+1,high);
        }
    }
    //设置alow为temp，和ahigh和low比较

    /**
     * 得到中轴
     * @param a
     * @param low
     * @param high
     */
    public static int getMid(int[] a,int low,int high){
        int temp = a[low];
        while (low<high){
           while (low<high && temp<=a[high]){//一定注意等号
               high--;
           }
            a[low]=a[high];
            while (low<high && temp>=a[low]){
                low++;
            }
            a[high]=a[low];
        }
        a[low]=temp;
        return low;
    }
}
