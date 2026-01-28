package com.dsa.algos;
public class FirstLastTotalInAnArray {
    static int firstOcc(int[] arr, int key){
        int s = 0;
        int e = arr.length -1;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                ans = mid;
                // Move left for the first occurrence
                e = mid - 1;
            }else if(arr[mid] < key){
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        return ans;
    }
    static int lastOcc(int[] arr, int key){
        int s = 0;
        int e = arr.length -1;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                ans = mid;
                // Move right for the last occurrence
                s = mid + 1;
            }else if(arr[mid] < key){
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        return ans;
    }
    static int totalOcc(int[] arr, int key){
        int fo = firstOcc(arr, key);
        int lo = lastOcc(arr, key);
        int total = lo - fo + 1;
        return total;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,5,6};
        System.out.println("First: " + firstOcc(arr, 3));
        System.out.println("Last: " + lastOcc(arr, 3));
        System.out.println("Total: " + totalOcc(arr, 3));
    }
}
