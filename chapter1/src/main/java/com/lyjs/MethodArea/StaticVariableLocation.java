package com.lyjs.MethodArea;

import java.util.ArrayList;
import java.util.List;

/**
 * 在不断向静态列表中添加数据的时候堆内存是不断增大的，最后直接抛出oom
 * 可证明静态变量确实是存放在堆中的
 */
public class StaticVariableLocation {
    // 静态变量
    public static List<Byte[]> staticList = new ArrayList<>();

    public static void main(String[] args) {
        // 不断向静态列表中添加数据，使堆内存溢出
        try {
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                staticList.add(new Byte[1024 * 1024]); // 每次添加1MB的数据
            }
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }
}