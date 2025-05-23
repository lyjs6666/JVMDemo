package com.lyjs.HeapOOMTest;

import java.util.ArrayList;

/**
 * -Xms6m -Xmx6m
 * -XX:+HeapDumpOnOutOfMemoryError
 * 开启这个参数后当空间溢出就会产生dump文件
 */
public class Test1 {

    private byte[] bits=new byte[1024*1024];

    public static void main(String[] args) {

        ArrayList<Object> objects = new ArrayList<>();
        int i=0;
        try{
                while(i++>=0){
                    objects.add(new Test1());
                }
        }catch(Exception e){
            System.out.println("一共生成"+i+"个对象");

        }
    }
}
