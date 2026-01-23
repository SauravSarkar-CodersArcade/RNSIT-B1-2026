package com.exceptions;
public class E1 {
    public static void main(String[] args) {
        int i;
        int j;
        int k=0;
        i = 10;
        j = 10;
        try {
            k = i / j;
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[10]);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Some error occurred");
            // e.printStackTrace();
        }finally {
            System.out.println("End of execution");
        }
        System.out.println("The value of k is: " + k);
    }
    static {
        System.out.println("Start");
    }
}
