package com.example.String;

import java.util.Arrays;

/**
 * Created by dlancer on 2017/5/4.
 * 编写一个字符串函数，输入一个字符串和字节数，输出按字节截取的字符串，但是保留
 * 汉字不被切半个。
 * 举例：输入：“人abc”，4，输出：人ab，汉字占用两个字节数，字母一个。P139
 */

public class StringTest1 {
    public static void main(String[] args){
        StringTest1 s = new StringTest1();
        s.truncateStr("中国sdf",1);
    }
    public boolean isChinese(char c){
        String str = String.valueOf(c);
        return str.getBytes().length > 1 ? true:false;
    }
    public  void truncateStr(String str,int n){
        char[] cc = str.toCharArray();
        System.out.print( Arrays.toString(cc));

    }
}
