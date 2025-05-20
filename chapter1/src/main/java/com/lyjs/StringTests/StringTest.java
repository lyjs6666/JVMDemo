package com.lyjs.StringTests;

import org.junit.Test;

public class StringTest {
    /**
     * C:\Users\86130>jinfo -flag StringTableSize 20032
     * -XX:StringTableSize=65536
     * java17 中字符串常量池默认大小变为65536
     *
     *
     * 关于字符串常量池
     * Java 6 及以前
     * 字符串常量池位于永久代（PermGen），而非堆内存。即方法区
     * 永久代是独立于堆的内存区域，主要存储类元数据、静态变量等。
     * Java 7
     * 字符串常量池被移至 堆（Heap）的新生代（Young Generation）。
     * 主要原因：避免永久代空间不足，利用堆的垃圾回收机制。
     * Java 8 及以后
     * 永久代被移除，改为元空间（Metaspace）。
     * 字符串常量池仍在堆（Heap），但具体位置与垃圾回收器有关：
     * G1 垃圾回收器：字符串常量池位于堆的老年代（Old Generation）。
     * CMS、Parallel 等垃圾回收器：通常位于新生代的 Eden 区
     *
     *
     *
     * 字符串常量池中每种字符串最多只有一份
     * 当通过new的方式创建一个string会在堆中分配内存创建一个string类型的变量
     * 而不会直接放入字符串常量池中
     * 只有调用intern()方法之后，这个对应的字符串才一定在字符串常量池中
     * intern方法，首先查看对应的equals方法匹配的字符串是否在pool中
     * 如果在，返回引用
     * 否则将该字符串放入pool，并返回引用
     * @param args
     */



    public static void main(String[] args){


        Object o1 = new Object();

        String string = o1.toString();//2865


//        // 在调用 intern() 之前检查
//        String constantString = "java.lang.Object@" + Integer.toHexString(o1.hashCode());
//        System.out.println(string == constantString.intern()); // 输出 false

        String string1 = string.intern();//intern首先会找对应的字符串是否在字符串常量池中，
                                        // 如果在返回引用，这里把上面生成的字符串的引用返回

        System.out.println(string==string1); //输出为false


        //由此证明，调用toString方法不会将字符串放入常量池

//        Object o = new Object();
//        String string2 = o.toString();
//        String string3 = o.toString();
//        System.out.println(string == string2);
//        //这里为false，进一步证明

    }

    @Test
    public void test(){
        /**
         * o1.toString() 生成的字符串是动态创建的，首次调用 string.intern() 时：
         * JVM 发现常量池中没有该字符串，于是将 string 的引用直接存入常量池（而非复制内容）。
         * 因此，string 和 string1 指向同一个对象（堆中的动态字符串），== 比较结果为 true。
         *
         * JDK 7+ 的优化
         * 在 JDK 7 之前，常量池存放在永久代（PermGen），intern() 会复制字符串到永久代，导致 string 和 string1 指向不同对象。
         * 但 JDK 7+ 将常量池移至堆中，intern() 可以直接存储堆中对象的引用，避免复制，因此 == 比较为 true。
         *
         */
        Object o1 = new Object();
        String string = o1.toString();    // 动态生成 "java.lang.Object@XXXX"
        String string1 = string.intern(); // 将 string 的引用存入常量池
        System.out.println(string == string1); // true（指向同一对象）
    }

    @Test
    public void Test1(){
        String a="a";
        String b="b";
        String ab="ab";
        String c=a+b;
        //你看到的字节码通过 invokedynamic 调用 StringConcatFactory.makeConcatWithConstants 引导方法，
        // 动态生成字符串拼接逻辑。
        // 这种方式比传统的 StringBuilder 更灵活高效，尤其在处理复杂拼接场景时。
        System.out.println(c==ab);
       // StringConcatFactory.makeConcatWithConstants()
//        这个方法通过以下机制提升性能：
//        常量预合并：将拼接中的常量部分在编译期合并
//        动态生成代码：根据拼接模式生成最优字节码
//        减少中间对象：避免不必要的 StringBuilder 创建,
//        方法句柄缓存：通过 ConstantCallSite 缓存优化调用路径
        //generateMHInlineCopy：核心方法，根据模板生成最优拼接逻辑
        //可能使用 StringBuilder、StringConcatHelper 或直接内存操作
        //对常量部分进行预优化（如合并相邻常量）
    }

    @Test
    public void Test2(){
        final String a="a";
        final String b="b";//对于final修饰的在编译时就会将它逻辑上分配到内存中
        String c="ab";
        String d=a+b;
        System.out.println(c==d);//true
    }

    @Test
    public void compactstring(){
        long begin = System.currentTimeMillis();
//        m1(100000);//1128
        m2(1000000);//12
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    public void m1(int n){
        String a="a";
        while(n-->0){
            a+="a";
        }
    }

    public void m2(int n){
        StringBuilder sb=new StringBuilder();
        while(n-->0){
            sb.append("a");
        }
    }

}
