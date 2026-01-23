package com.oops.abstraction;
abstract class Animals {
    // If a class has only abstract methods - 100% abstraction
    // If it has even one normal method it is not 100% abstraction
    // Two types of methods - 1. Normal or Concrete 2. Abstract
    void eat(){
        System.out.println("Animal eats some food!");
    }
    // Abstract Method - It is implemented in the child classes
    abstract void run(); // This method cannot have a body
}
class Cheetah extends Animals{
    @Override
    void run() {
        System.out.println("Cheetah runs very fast");
    }
    public static void main(String[] args) {
        Cheetah cheetah = new Cheetah();
        cheetah.eat();
        cheetah.run();
    }

}
