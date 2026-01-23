package com.exceptions;
// throw -> User Defined Exceptions / Custom Exceptions
public class E2 {
    static void checkAge(int age){
        if(age >= 18){
            System.out.println("Access Granted - Eligible");
        }else {
            throw new RuntimeException("Access Denied - Age is less than 18");
        }
    }

    public static void main(String[] args) {
        checkAge(13);
    }
}
