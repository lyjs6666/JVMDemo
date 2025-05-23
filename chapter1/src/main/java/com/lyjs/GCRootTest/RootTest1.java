package com.lyjs.GCRootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RootTest1 {

    public static void main(String[] args) throws InterruptedException {

        List<Object> nums=new ArrayList<>();

        for(int i=0;i<1000;i++){

            nums.add(String.valueOf(i));
            Thread.sleep(50);

        }

        System.out.println("对象生成完毕，请指示！");
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        nums=null;
        System.out.println("gc完毕！");
        scanner.next();

    }
}
