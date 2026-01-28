package com.dsa.algos.collections;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionsClassExample {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(81);
        integers.add(11);
        integers.add(21);
        integers.add(41);
        System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);
        Collections.reverse(integers);
        System.out.println(integers);
    }
}
