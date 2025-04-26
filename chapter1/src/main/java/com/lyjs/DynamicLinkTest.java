package com.lyjs;

public class DynamicLinkTest {

    /**
     *
     * Class 文件常量池：每个 .class 文件都有一个常量池，它在编译阶段生成，包含了类的各种常量信息，
     * 像类名、方法名、字段名、字符串常量等。这些信息以二进制形式存储在 .class 文件中。
     *
     * 运行时常量池：它是 Class 文件常量池在运行时的表现形式。当 Java 虚拟机加载 .class 文件时，
     * 会将其中的常量池信息加载到运行时常量池中。运行时常量池除了包含 Class 文件常量池的内容外，还可以在运行时动态添加常量，
     * 例如通过 String.intern() 方法。
     *
     * 运行时常量池是方法区的一部分（在 Java 8 及以后，方法区的实现是元空间）。方法区是所有线程共享的内存区域，
     * 因此运行时常量池也是所有线程共享的。这意味着所有线程都可以访问和使用运行时常量池中的常量信息。
     *
     */

    int num=10;

    public static void main(String[] args) {
        String s1="6666";
        String s2="6666";
        System.out.println(s1==s2);
    }
    public void m1(){

        System.out.println("jkd-6666");
        m2();
    }

    private void m2() {

        System.out.println("lyjs6666");
    }
}
