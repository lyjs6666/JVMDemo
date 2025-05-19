package com.lyjs.MethodArea;


/**
 * 使用以下指令选择对应的字节码文件就可以反编译并保存到对应的txt文件中
 *javap -v -p MethodInnerStruct.class > text.txt
 *
 */
public class MethodInnerStruct extends Object implements Comparable<MethodInnerStruct>{

    private static int cnt=1;

    public String name;


    public void print(){
        System.out.println(cnt);
    }
    @Override
    public int compareTo(MethodInnerStruct o) {
        return 0;
    }
}
