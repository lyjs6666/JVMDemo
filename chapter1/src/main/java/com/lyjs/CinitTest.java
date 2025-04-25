package com.lyjs;

public class CinitTest {

    private static int num1=1;

    /**
     *
     * JVM先从磁盘中使用应用加载器加载这个类，接着给整个类的类变量分配空间
     * 此时类变量都为默认，后面初始化时才会执行初始化逻辑
     *
     */
    static {
        num2=1;
        num1=2;

    }

    private static int num2=2;

    public static void main(String[] args) {
        System.out.println(num1);
        System.out.println(num2);
    }
}
