package com.dsa.algos.backtracking;
import java.util.Scanner;
public class RatInAMaze {
    public static boolean isPathSafe(int[][] arr, int x, int y, int n){
        return (x < n && y < n && arr[x][y] == 1);
    }
    public static boolean ratInMaze(int[][] arr, int n, int x, int y,
                                    int[][] resultantArray){
        // Base Cases // Edge cases
        // What if the rat has reached the destination
        if(x == n-1 && y == n-1){
            resultantArray[x][y] = 1;
            return true;
        }
        // Check if the rat can stand at the current position
        if(isPathSafe(arr,x,y,n)){
            resultantArray[x][y] = 1;
            // Move forward to find a path
            if(ratInMaze(arr,n, x+1, y, resultantArray)){
                return true;
            }
            // Move downward to find a path
            if(ratInMaze(arr,n,x,y+1,resultantArray)){
                return true;
            }
            // We couldn't find a path, so we backtrack
            resultantArray[x][y] = 0; // Backtracking
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        // Input Array
        int[][] arr = new int[n][n];
        System.out.println("Enter the maze values (1 or 0):");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        // resultant array of all zeroes initially
        int[][] resultantArray = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                resultantArray[i][j] = 0;
            }
        }
        if(ratInMaze(arr,n, 0,0, resultantArray)){
            // If true there is a path - print the path
            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++){
                    System.out.print(resultantArray[i][j] + " ");
                }
                System.out.println();
            }
        }else {
            System.out.println("No solution found!");
        }
    }
}
