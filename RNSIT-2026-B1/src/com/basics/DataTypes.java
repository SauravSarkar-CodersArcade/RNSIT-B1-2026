package com.basics;

public class DataTypes {
    public static void main(String[] args) {
        byte b = 127;
        double y = 2.5;
        // By default any decimal value in C, C++ or Java is double
        float x = 1.5F; // To declare float we use f or F
        int z = (int)x; // Narrowing Casting - User (manual)
        float w = z; // Widening Casting - Compiler / JVM (automatic)
        int p = 'a';
        System.out.println(p);
        boolean status = (3>4) ? true : false;
        String  status1 = (3>4) ? "true" : "false";
        System.out.println(status);
    }
}
