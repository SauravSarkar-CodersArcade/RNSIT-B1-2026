package com.dsa.algos;

import java.util.Properties;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] twoD = {{1,2,3,4,5,6}
                       ,{4,5,6,4},
                        {7,8,9}};
        for (int i=0; i<twoD.length; i++){
            for (int j=0; j<twoD[i].length; j++){
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
        // For each loop syntax
        /*
        for(return type var : collection){
        statements...!
        }
         */
        for(int[] x : twoD){
            for (int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

}
