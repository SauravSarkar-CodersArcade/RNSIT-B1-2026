package com.oops.encap;

public class EncapDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Sanjay");
        e1.setSalary(30000);
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}
