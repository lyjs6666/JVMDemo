package com.lyjs.ReferenceTest;

import java.lang.ref.WeakReference;

public class WeakReferenceTest {
    /**
     * 关于弱引用
     * 只要进行垃圾回收就会将其回收掉，不管剩余内存空间多还是少
     * @param args
     */
    public static void main(String[] args) {

        WeakReference<String> weakReference=new WeakReference<>(new String("hello"));
        System.out.println(weakReference.get());//test
        System.gc();
        System.out.println(weakReference.get());//null
    }
}
