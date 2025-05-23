package com.lyjs.GcTests;

/**
 *
 * -XX:+PrintCommandLineFlags
 * -XX:ConcGCThreads=3 -XX:G1ConcRefinementThreads=13 -XX:GCDrainStackTargetSize=64
 * -XX:InitialHeapSize=254884992 -XX:MarkStackSize=4194304 -XX:MaxHeapSize=4078159872
 * -XX:MinHeapSize=6815736 -XX:+PrintCommandLineFlags -XX:ReservedCodeCacheSize=251658240
 * -XX:+SegmentedCodeCache -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseG1GC //使用g1垃圾收集器
 * -XX:-UseLargePagesIndividualAllocation
 *
 */
public class GCUse {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
