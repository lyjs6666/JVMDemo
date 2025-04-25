package com.lyjs;

public class ClassLoaderTest {

    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//jdk.internal.loader.ClassLoaders$AppClassLoader@63947c6b
        ClassLoader parent = systemClassLoader.getParent();//parent = jdk.internal.loader.ClassLoaders$PlatformClassLoader@6d311334
        System.out.println("parent = " + parent);
        ClassLoader parent1 = parent.getParent();
        System.out.println("parent1 = " + parent1);
        //用户自定义类默认使用系统类加载器
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();//classLoader = jdk.internal.loader.ClassLoaders$AppClassLoader@63947c6b
        System.out.println("classLoader = " + classLoader);

        //java核心类库使用引导类加载器加载
        System.out.println(String.class.getClassLoader());
    }
}
