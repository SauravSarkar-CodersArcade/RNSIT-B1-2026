package com.dsa.algos.greedy;
import java.util.Arrays;
public class MinPlatforms {
    public static int minPlatforms(int[] arr, int[] dep){
        // Sort both the arrays
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n = arr.length;
        int platformsNeeded = 0, maxPlatforms = 0;
        int i = 0, j = 0;
        while (i < n && j < n){
            if(arr[i] <= dep[j]){
                platformsNeeded++;
                i++;
            }else {
                platformsNeeded--;
                j++;
            }
            maxPlatforms = Math.max(platformsNeeded, maxPlatforms);
        }
        return maxPlatforms;
    }
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1120, 1130, 1200, 1900, 2000};
        int result = minPlatforms(arr, dep);
        System.out.println("Min Platforms: " + result);
    }
}
