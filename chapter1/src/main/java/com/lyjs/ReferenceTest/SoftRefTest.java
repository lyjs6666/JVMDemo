package com.lyjs.ReferenceTest;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * 软引用只有内存空间不够时才会回收
 *
 * 设置堆的大小
 * -Xms6m -Xmx6m
 */
public class SoftRefTest {

    public static void main(String[] args) {

        SoftReference<String> weakReference=new SoftReference<>(new String("test"));
        System.out.println(weakReference.get());//test

        try{
//            System.gc(); //当内存空间充足时，即使显示调用gc也不会回收软引用
            byte[] b=new byte[1024*1024*3];//4mb

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            /**
             * 当内存空间不足要gc时就会将软引用的对象给清楚
             */
            System.out.println(weakReference.get());//null
        }



    }
}
