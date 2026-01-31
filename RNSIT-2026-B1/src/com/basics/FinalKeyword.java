package com.basics;

public class FinalKeyword {
    {
        System.out.println("IIB 2"); // Instance Initializer Block
    }
    final int x; // Final -When not initialized, do it in the constructor
    FinalKeyword(){
        x = 200;
    }
    static final int y; // Static - Final -When not initialized, do it in the constructor

    public static void main(String[] args) {
        new FinalKeyword();
        System.out.println("Mohith is in first bench!");


    }
    static {
        y = 2;
        System.out.println("College Starts. Doors Open");
    }
    {
        System.out.println("IIB 1");
    }
}
