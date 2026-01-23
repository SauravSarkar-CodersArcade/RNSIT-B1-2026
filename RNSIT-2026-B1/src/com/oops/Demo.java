package com.oops;
public class Demo {
    // this keyword is used to refer to anything from the current class
    String i; // Instance Variable - to refer to this current var - we use 'this'
    void change(String i){
        this.i = i;
    }
    void display(){
        System.out.println("The value of i is: " + i);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.change("Saurav");
        demo.display();
    }
}
