package com.lyjs;

public class CinitTest {
    /**
     * JVM先从磁盘中使用类加载器加载这个类
     * 接着给整个类的类变量分配空间 此时类变量都为默认，
     *后面初始化时才会执行初始化逻辑
     * 静态变量初始化按照代码中出现的顺序执行（包括静态代码块）
     * 例如下面就是依次按照 1 2 3的顺序初始化，最后num1和num2都是2
     */
    //1
    private static int num1=1;

    //2
    static {
        num2=1;
        num1=2;

    }
    //3
    private static int num2=2;

    public static void main(String[] args) {
        System.out.println(num1);
        System.out.println(num2);
    }
}
