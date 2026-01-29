package com.dsa.algos.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class My_Number {
    int x;
    My_Number(int x){
        this.x = x;
    }
}
// Separate class for the comparing logic
class MySort implements Comparator<My_Number>{
    public int compare(My_Number a, My_Number b){
        return a.x - b.x; // Ascending Order
    }
}
public class CompareExample {
    public static void main(String[] args) {
        ArrayList<My_Number> list = new ArrayList<>();
        list.add(new My_Number(5));
        list.add(new My_Number(1));
        list.add(new My_Number(3));
        Collections.sort(list, new MySort());
        for(My_Number n : list){
            System.out.print(n.x + " ");
        }
    }
}
