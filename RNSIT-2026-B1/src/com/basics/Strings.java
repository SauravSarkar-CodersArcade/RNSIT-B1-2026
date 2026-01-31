package com.basics;

public class Strings {
    public static void main(String[] args) {
        char[] letters = {'C','h','a','r','i','t','h','r','a'};
        // String name = letters.toString(); // Wrapper Classes
        String name = new String(letters);
        System.out.println(name);
    }
}
