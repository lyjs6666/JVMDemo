package com.lyjs;

import java.util.ArrayList;

/**
 * 常量池之前是存放在方法区中，自从1.7之后开始存放在堆中
 */
public class GCDetails {

    public static void main(String[] args) {

        int i=0;
        String a="lyjs";
        ArrayList<String> objects = new ArrayList<>();
        try{

            while(true){

                objects.add(a);
                a=a+a;
                i++;
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("运行了"+i);
        }
    }
}
