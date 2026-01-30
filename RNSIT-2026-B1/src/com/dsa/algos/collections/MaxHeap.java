package com.dsa.algos.collections;
import java.util.Collections;
import java.util.PriorityQueue;
public class MaxHeap {
    public static void main(String[] args) {
        // A PriorityQueue is a min heap by default in Java
        // To make maxHeap we use Collections.reverseOrder()
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(8);
        maxHeap.add(2);
        maxHeap.add(9);
        maxHeap.add(6);
        maxHeap.add(1);
        System.out.println(maxHeap); // Actual Max Heap
        while (!maxHeap.isEmpty()){
            System.out.print(maxHeap.poll() + " ");
        }
    }
}
