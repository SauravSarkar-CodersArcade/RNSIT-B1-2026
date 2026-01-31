package com.oops.questions;
public interface Demo {
    void function();
}
class RNSIT {
    public static void main(String[] args) {
        Demo obj = new Demo(){
            public void function(){
                System.out.println("Boiler-Plate Code!");
            }
        };
        obj.function();
        // Scala
        Demo obj1 = () -> System.out.println("Scala Code");
        obj1.function();
    }
}
