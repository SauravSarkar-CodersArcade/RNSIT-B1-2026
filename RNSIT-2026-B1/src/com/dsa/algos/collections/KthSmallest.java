package com.dsa.algos.collections;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
public class KthSmallest {
    public static int kthSmallest(int[] arr, int k){
        // We will need a max heap
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr){
            maxHeap.add(num);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        return maxHeap.peek(); // The top element is the kth-smallest
    }
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int k = 3;
        int ans = kthSmallest(arr, k);
        System.out.println("The " + k + "th smallest element in " +
                Arrays.toString(arr) + " is " + ans);
    }
}
