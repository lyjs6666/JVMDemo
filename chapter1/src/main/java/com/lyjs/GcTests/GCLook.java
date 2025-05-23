package com.lyjs.GcTests;

import java.util.ArrayList;
import java.util.List;

public class GCLook {

    public static void main(String[] args) {

        List s=new ArrayList();
        while(true) {
            s.add(new int[1024*1024]);
            s.remove(0);
        }

    }
}
