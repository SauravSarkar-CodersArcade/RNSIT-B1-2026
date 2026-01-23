package com.oops.inheritance.single;

public class Animal {
    void makeSound(){
        System.out.println("Some Sound");
    }
}
class Cat extends Animal{
    void run(){
        System.out.println("Cats run fast");
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        cat.run();
    }
}
