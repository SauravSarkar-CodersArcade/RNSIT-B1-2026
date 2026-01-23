package com.exceptions; // Performance Testing - Load testing
public class Demo {
    static void test() throws Throwable{
        throw new Throwable("Something went wrong!");
    }
    public static void main(String[] args) {
        try {
            test();
        }catch (Throwable t){
            System.out.println("Handled: " + t.getMessage());
        }
    }
}
/*
throw new String("error"); ❌
throw new Throwable("error"); ✅
throw new RuntimeException("error"); ✅
throw new Exception("error"); ✅
 */
