package com.lyjs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * -XX:NewRatio 老年代与新生代的内存大小的比值
 * 例如当他为2时，老年代/新生代为2，老年代占总体的2/3，新生代占总体的1/3
 *
 */
public class OOMTest {

    private static class Picture{
        int[] bis;

        public Picture(int len){
            bis = new int[len];
        }

    }

    public static void main(String[] args) throws InterruptedException {

        List<Picture> pictures = new ArrayList<Picture>();
        while(true){

                Thread.sleep(100);
            pictures.add(new Picture(1024*255));
        }
    }
}
