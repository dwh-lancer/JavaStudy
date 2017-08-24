package com.example.Array.LianjiaWeb;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dlancer on 2017/8/19.
 */

public class LianjiaWeb2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,temp,cnt;
        int[] a = new int[n];
        int[] b = new int[n];
            while(sc.hasNext())
            {
                for(i=0;i<n;i++)
                {
                   a[i] =sc.nextInt();
                    b[i]=a[i];
                }
               Arrays.sort(b);
                cnt=0;
                for(i=0;i<n;i++)
                {
                    if(a[i]!=b[i])   //
                    {
                        for(j=i;j<n;j++)   //
                        {
                            if(a[j]==b[i] && a[j]!=b[j])   //
                            {
                                temp=a[i];
                                a[i]=a[j];
                                a[j]=temp;
                                cnt++;
                                break;
                            }
                        }
                    }
                }
                System.out.print(cnt);
            }

    }
}
