package com.dsa.algos.collections;

public class PropertiesExample {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.out.println(path);
        System.out.println(System.currentTimeMillis());
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("java.home"));
    }
}
