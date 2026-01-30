package com.dsa.algos.collections;
import java.util.PriorityQueue;
public class MinHeap {
    public static void main(String[] args) {
        // A PriorityQueue is a min heap by default in Java
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(8);
        minHeap.add(2);
        minHeap.add(9);
        minHeap.add(6);
        minHeap.add(1);
        System.out.println(minHeap); // Actual Min Heap
        while (!minHeap.isEmpty()){
            System.out.print(minHeap.poll() + " ");
        }
    }
}
