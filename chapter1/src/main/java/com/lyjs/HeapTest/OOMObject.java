package com.lyjs.HeapTest;

import java.util.ArrayList;
import java.util.List;

public class OOMObject {

    static class OOM{
        //64k
        public byte[] placeholder=new byte[64*1024];
    }

    public static void main(String[] args) throws InterruptedException {
        test();
        System.gc();
    }

    public static void test() throws InterruptedException {
        List<OOM> list=new ArrayList<OOM>();
        for(int i=0;i<1000;i++){
            Thread.sleep(50);
            list.add(new OOM());
        }

    }
}
