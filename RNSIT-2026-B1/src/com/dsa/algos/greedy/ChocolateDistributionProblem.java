package com.dsa.algos.greedy;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m){
        if(m == 0 || arr.size() < m){
            return 0;
        }
        Collections.sort(arr);
        int minDiff = Integer.MAX_VALUE; // Initially very large
        // Sliding window
        for (int i=0; i + m - 1 < arr.size(); i++){
            int diff = arr.get(i+m-1) - arr.get(i);
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
}
public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        arr.add(9);
        arr.add(12);
        arr.add(56);
        int m = 3;
        Solution solution = new Solution();
        int result = solution.findMinDiff(arr, m);
        System.out.println("Minimum Diff: " + result);
    }
}
