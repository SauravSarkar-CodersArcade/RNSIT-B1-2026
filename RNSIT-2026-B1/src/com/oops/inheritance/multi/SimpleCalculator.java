package com.oops.inheritance.multi;
public class SimpleCalculator {
    void add(int a, int b){
        System.out.println(a+b);
    }
}
class AdvancedCalculator extends SimpleCalculator{
    void subtract(int a, int b){
        System.out.println(a-b);
    }
}
class SuperAdvancedCalculator extends AdvancedCalculator{
    void square(int x){
        System.out.println(x * x);
    }
    void product(int a, int b){
        System.out.println(a * b);
    }
}
class MultipleInheritance{
    public static void main(String[] args) {
        SimpleCalculator c1 = new SimpleCalculator();
        System.out.println("---------------------------------------------------------");
        c1.add(1,2);
        System.out.println("---------------------------------------------------------");
        AdvancedCalculator c2 = new AdvancedCalculator();
        c2.add(1,2);
        c2.subtract(10,5);
        System.out.println("---------------------------------------------------------");
        SuperAdvancedCalculator c3 = new SuperAdvancedCalculator();
        c3.add(1,2);
        c3.subtract(2,3);
        c3.product(10,6);
        c3.square(100);
        System.out.println("---------------------------------------------------------");
    }
}