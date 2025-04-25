package com.heima;

public class VMStackTest {

    private static int count=1;
    //20520  moren
    //虚拟机栈设置为 256K,3980次递归调用
    public static void main(String[] args) {

        System.out.println(count);
        count++;
        main(args);
    }
}
