package com.lyjs;

public class VariableTableTest {


    public static void  main(String[] args) {

        int num=10;
        {
            String s="666";
        }
        System.out.println(num);
        test();

    }

    /**
     * 当JVM调用某个方法时，会向非静态方法的局部变量表中添加指向当前对象的this指针
     * 存放在索引为0的slot中，其余局部变量依次按照顺序存放
     */
    public static void test(){
        String s="666";
        System.out.println("s = " + s);

        Integer num;
        /**
         * 局部变量使用前必须赋值
         */
    }

}
