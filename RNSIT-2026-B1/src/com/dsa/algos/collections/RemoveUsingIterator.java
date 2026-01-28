package com.dsa.algos.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class RemoveUsingIterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(11);
        numbers.add(1);
        numbers.add(20);
        numbers.add(13);
        Iterator<Integer> it = numbers.iterator();
//        while (it.hasNext()){
//            Integer i = it.next();
//            if(i > 10){
//                it.remove();
//            }
//        }
        numbers.removeIf(i -> i > 10); // One Liner (Lambda Expressions)(Java-8)
        System.out.println(numbers);
    }
}
