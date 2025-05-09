package com.lyjs;

public class StackAllocation {

    public static void main(String[] args) throws InterruptedException {

        long begin = System.currentTimeMillis();

        for(int i=0;i<1000000000;i++){

            al();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin+"ms");
//        Thread.sleep(10000000);
    }

    public static void al(){
        User user=new User();
    }

    private static class User{
        int x;
    }
}
