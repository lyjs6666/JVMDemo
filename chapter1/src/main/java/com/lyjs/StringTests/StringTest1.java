package com.lyjs.StringTests;

public class StringTest1 {

    public static void main(String[] args) {
        String a = new String("a");
        /**
         * 编译这行代码时，遇到字面量‘a’，
         * 会先将a放入字符串常量池，运行时运行到这段代码时会在堆中生成一个string对象,
         */
        String aa="a";//直接返回字符串常量池中”a“的引用
        /**
         * 当编译器遇到 字符串字面量 "a" 时，会执行以下操作：
         * 在 字符串常量池 中查找是否存在内容为 "a" 的字符串对象。
         * 若不存在，则在 常量池中直接创建 一个 "a" 字符串对象（由编译器自动完成，属于 静态存储区域 的对象）。
         * 若已存在（例如之前代码中已有 "a" 字面量），则直接复用常量池中的现有对象
         *
         * 代码执行到 String a = "a"; 时：
         * 变量 a 直接指向 字符串常量池中的 "a" 对象，不会在堆内存中创建新的 String 对象。
         * 此时，a 存储的是常量池中 "a" 对象的 内存地址引用。
         */
        System.out.println(a==aa);
        /**
         * 总结：对于字符串，只要是用new创建的，都会在堆中生成string对象，
         * 譬如上面的变量a，然后这个对象引用字符串常量池中的”a“的引用
         */
    }
}
