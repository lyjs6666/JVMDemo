package com.lyjs.MethodArea;

/**
 *
 * jdk1.7之前PermSize用来调整方法区的大小
 * C:\Users\86130>jinfo -flag PermSize 2992
 * no such flag 'PermSize'
 *
 * jdk1.8之后 MetaspaceSize
 * C:\Users\86130>jinfo -flag MetaspaceSize 2992
 * -XX:MetaspaceSize=22020096
 * 21MB
 *
 * C:\Users\86130>jinfo -flag MaxMetaspaceSize 2992
 * -XX:MaxMetaspaceSize=18446744073709551615
 */
public class MethodAreaTest1 {

    private static int a=0;
    static void print(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        MethodAreaTest1 m=null;
        m.print();
        System.out.println(a);
    }

}
