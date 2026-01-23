package com.oops.abstraction;
public interface Animal {
    // Because we have empty abstract methods - it is 100% abstraction
    void eat();
    void run();
}
class Rat implements Animal {
    @Override
    public void eat() {
        System.out.println("Rat eats cheese!");
    }
    @Override
    public void run() {
        System.out.println("Rats run fast!");
    }

    public static void main(String[] args) {
        Rat rat = new Rat();
        rat.eat();
        rat.run();
    }
}
