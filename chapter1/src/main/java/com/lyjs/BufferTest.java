package com.lyjs;

import java.nio.ByteBuffer;
import java.util.Scanner;

public class BufferTest {
    /**
     * 通过ByteBuffer可以使用本地内存空间
     * @param args
     */
    public static void main(String[] args) {
        int GB=1024*1024*1024;
        ByteBuffer allocate = ByteBuffer.allocateDirect(GB-8192);

        System.out.println("申请了1GB的空间");
        Scanner scanner = new Scanner(System.in);
        scanner.next();

        System.out.println("开始回收");
        System.gc();

    }


}
