package com.lyjs;

public class StringTest {
    /**
     * C:\Users\86130>jinfo -flag StringTableSize 20032
     * -XX:StringTableSize=65536
     * java17 中字符串常量池默认大小变为65536
     * @param args
     */

    public static void main(String[] args){

        //        String a="abc";
        //        String b="abc";
        //        b+="def";
        //args/static

        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        String string = o1.toString();//2865
        String string1 = o2.toString();//2866
        String string2 = o3.toString();//2867


    }

}
