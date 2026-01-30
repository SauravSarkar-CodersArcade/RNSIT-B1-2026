package com.dsa.algos.greedy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MinimumNumberOfCoins {
    public static void findMinimumCoins(List<Integer> coins, int V){
        // If the coins array is not sorted, sort it
        List<Integer> result = new ArrayList<>();
        for (int i=coins.size()-1; i>=0; i--){
            while (V >= coins.get(i)){
                V -= coins.get(i);
                result.add(coins.get(i));
            }
        }
        System.out.print("Coins selected: ");
        for (int num : result){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Min Number Of Coins: " +
                result.size());
    }
    public static void main(String[] args) {
        List<Integer> coins = Arrays.
                asList(1,2,5,10,20,50,100,200,500,1000,2000);
        int V1 = 91;
        int V2 = 31;
        findMinimumCoins(coins, V1);
        findMinimumCoins(coins, V2);
    }
}
