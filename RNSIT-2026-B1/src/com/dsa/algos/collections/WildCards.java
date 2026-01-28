package com.dsa.algos.collections;
import java.util.ArrayList;
import java.util.List;
public class WildCards {
    public static void printList(List<?> elements){
        for (Object o : elements){
            System.out.print(o + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        printList(integers);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Python");
        strings.add("Java");
        printList(strings);

    }
}
