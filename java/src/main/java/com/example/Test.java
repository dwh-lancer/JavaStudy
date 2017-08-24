package com.example;

import java.awt.SystemTray;
import java.util.Arrays;

/**
 * Created by dlancer on 2017/4/19.
 * break:
 */

public class Test {
    public static void main(String[] args){

        for (int i = 0; i < 20; i++) {
            if (i==10){
                break;
            }
            System.out.println(""+i);
        }
        for (int i = 0; i < 20; i++) {
            if (i==10){
                continue;
            }
            System.out.println(""+i);
        }

    }
}
