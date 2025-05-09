package com.lyjs;


/**
 *-X 虚拟机参数
 *  ms 初始内存
 *  mx 最大内存
 *
 *
 * 默认堆空间大小
 *  ms 电脑内存/64
 *  mx 电脑内存/4
 */
public class HeapSpecial {
    public static void main(String[] args) {

        long ms = Runtime.getRuntime().totalMemory()/1024/1024;
        long mx = Runtime.getRuntime().maxMemory()/1024/1024;

        System.out.println("ms:"+ms+"M");
        System.out.println("mx:"+mx+"M");

        System.out.println("系统内存大小为:"+ms*64.0/1024+"G");
        System.out.println("系统内存大小为:"+mx*4.0/1024+"G");
    }
}
