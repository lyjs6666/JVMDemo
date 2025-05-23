package com.lyjs.GCRootTest;

public class SystemGCTest {

    public static void main(String[] args) {

        new SystemGCTest();
        System.gc();
//        System.runFinalization();
        /**
         * GC 与 finalize() 的关系：
         * 若调用 System.gc()：
         * JVM 触发 GC，发现对象不可达，将其标记为 “待终结”，并在回收前执行 finalize()。
         * 若调用 System.runFinalization()：
         * JVM 仅检查 已标记为 “待终结” 的对象，但此时对象可能 尚未被 GC 扫描到（因为未触发 GC），因此 finalize() 不会执行。
         */
    }

    @Override
    public void finalize() {
        System.out.println("垃圾回收执行");
    }
}
