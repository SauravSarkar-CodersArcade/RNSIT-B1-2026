package com.basics;
public class BuilderExample {
    public void append(){
        StringBuilder buffer = new StringBuilder("RNS");
        System.out.println("Original String: " + buffer);
        buffer.append(" CSE");
        System.out.println("New String: " + buffer);
    }
    public void insert(){
        StringBuilder buffer = new StringBuilder("JA");
        System.out.println("Original String: " + buffer);
        buffer.insert(1, "AV"); // JA -> JAVA
        System.out.println("New String: " + buffer);
    }
    public void reverse(){
        StringBuilder buffer = new StringBuilder("NOHTYP");
        System.out.println("Original String: " + buffer);
        buffer.reverse();
        System.out.println("New String: " + buffer); // PYTHON
    }
    public static void main(String[] args) {
        new BuilderExample().append();
        new BuilderExample().insert();
        new BuilderExample().reverse();
        String name = "CSE";
        System.out.println(name.toLowerCase());
        System.out.println(name);
    }
}
