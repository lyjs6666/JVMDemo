package com.heima;

public class StackFrameTest {

    public static void main(String[] args) {

        System.out.println("main begin");
        method1();
        System.out.println("main end");
    }

    public static void method1() {
        System.out.println("method1 begin");

        method2();
        System.out.println("method1 end");
    }

    public static void method2() {

        System.out.println("method2 begin");

        System.out.println("method2 end");
    }
}
