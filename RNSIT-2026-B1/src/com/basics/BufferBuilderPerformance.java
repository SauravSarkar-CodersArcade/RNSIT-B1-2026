package com.basics;
public class BufferBuilderPerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("RNS");
        for (int i=1; i<100000; i++){
            buffer.append(" CSE");
        }
        System.out.println("Buffer Time: " +
                (System.currentTimeMillis()-startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("RNS");
        for (int i=1; i<100000; i++){
            builder.append(" CSE");
        }
        System.out.println("Builder Time: " +
                (System.currentTimeMillis()-startTime) + "ms");
    }
}
