package com.dsa.algos.collections;
import java.util.PriorityQueue;
public class KLargestElements {
    public static void kLargestElements(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // 1. Insert all n elements into the min heap
        // 2. Remove the elements exceeding the k size
        for(int num : arr){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.poll(); // remove extra elements
            }
        }
        // 3. Print the remaining k elements
        while (!minHeap.isEmpty()){
            System.out.print(minHeap.poll() + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {19,21,4,9,3,7};
        int k = 3;
        kLargestElements(arr, k);
    }
}
