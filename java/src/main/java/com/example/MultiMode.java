package com.example;

import com.example.String.StringTest1;

/**
 * Created by dlancer on 2017/5/7.
 */

public class MultiMode {
    public static void main(String args[]){
        Derived b = new Derived();
        //此时会调用Base类的构造方法，而Base的构造方法中调用了g()方法，
        //由于java多态特性，此时会调用子类的g方法。
        b.f();//此时是Derived的实例对象的方法。而不是Base的方法。
        b.g();
        b.h();
        b.i();
    }
}

class Base{
    public Base(){
        g();
    }
    public void f(){
        System.out.println("Base f()");
    }
    public void g(){
        System.out.println("Base g()");
    }
    public void i(){
        System.out.println("Base i()");
    }
}

class Derived extends Base{
    public void f(String a){
        System.out.println("Derived f()");
    }
    public void g(){
        System.out.println("Derived g()");
    }
    public void h(){
        System.out.println("Derived h()");
    }
}

