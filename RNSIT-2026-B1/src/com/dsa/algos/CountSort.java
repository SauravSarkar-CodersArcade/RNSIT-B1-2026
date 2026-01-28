package com.dsa.algos;

import java.util.Arrays;

public class CountSort {
    static void countSort(int[] arr){
        // Step 1:
        int k = arr[0];
        for (int i=1; i< arr.length; i++){
            if(arr[i] > k){
                k = arr[i];
            }
        }
        // Step 2:
        int[] count = new int[k+1];
        // Step 3:
        for (int i=0; i< arr.length; i++){
            count[arr[i]]++;
        }
        // Step 4:
        for (int i=1; i<=k; i++){
            // curr = curr + prev
            count[i] += count[i-1];
        }
        // Step 5:
        int[] output = new int[arr.length];
        // Step 6:
        for (int i= arr.length-1; i>=0; i--){
            output[--count[arr[i]]] = arr[i];
        }
        // Copy the o.p back to the input
//        for (int i=0; i< arr.length; i++){
//            arr[i] = output[i];
//        }
        System.arraycopy(output, 0, arr, 0, arr.length);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,4,1,6,4,3};
        System.out.println("Before: " + Arrays.toString(arr));
        countSort(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
}
