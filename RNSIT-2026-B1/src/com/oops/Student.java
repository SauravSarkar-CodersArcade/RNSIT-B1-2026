package com.oops;
public class Student {
    String name;
    int age;
    String branch;
    String email;
    Student(String name, int age, String branch, String email){
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.email = email;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 21, "CSE", "rahul@gmail.com");
        Student s2 = new Student("Sanjay", 22, "ISE", "sanjay@gail.com");

    }
}
