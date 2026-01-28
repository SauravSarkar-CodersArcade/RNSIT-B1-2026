package com.dsa.algos;
public class SquareRootBinarySearch {
    static int sqrtBinarySearch(int n){
        int s = 0;
        int e = n;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            int square = mid * mid;
            if(square == n){
                return mid;
            }
            else if(square > n){
                // Go to the left hand side
                e = mid - 1;
            }else {
                // Store the ans & go to the right hand side
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sqrtBinarySearch(37));
    }
}
