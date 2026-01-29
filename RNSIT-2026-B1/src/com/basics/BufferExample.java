package com.basics;
public class BufferExample {
    public void append(){
        StringBuffer buffer = new StringBuffer("RNS");
        System.out.println("Original String: " + buffer);
        buffer.append(" CSE");
        System.out.println("New String: " + buffer);
    }
    public void insert(){
        StringBuffer buffer = new StringBuffer("JA");
        System.out.println("Original String: " + buffer);
        buffer.insert(1, "AV"); // JA -> JAVA
        System.out.println("New String: " + buffer);
    }
    public void reverse(){
        StringBuffer buffer = new StringBuffer("NOHTYP");
        System.out.println("Original String: " + buffer);
        buffer.reverse();
        System.out.println("New String: " + buffer); // PYTHON
    }
    public static void main(String[] args) {
        new BufferExample().append();
        new BufferExample().insert();
        new BufferExample().reverse();
        String name = "CSE";
        System.out.println(name.toLowerCase());
        System.out.println(name);
    }
}
