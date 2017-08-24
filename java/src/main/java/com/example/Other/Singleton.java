package com.example.Other;

/**
 * 单例模式
 * Created by dlancer on 2017/4/11.
 */

public class Singleton {

    private Singleton() {
    }
    //类被加载的时候已经创建唯一的实例。
    private static Singleton uniqueInstance = new Singleton();

    public static Singleton getInstance() {
        return uniqueInstance;
    }

}
