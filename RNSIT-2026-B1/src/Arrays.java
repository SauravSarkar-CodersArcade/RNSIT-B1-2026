public class Arrays {
    public static void main(String[] saurav) { // BOSCH - O(n)
        System.out.println(saurav[0]);
        System.out.println(saurav[1]);
        int[] arr = {1,2,3,5,1,2};
        twoUniqueElements(arr);
    }
    static void twoUniqueElements(int[] arr){
        int n1 = 0;
        int n2 = 0;
        int xorAll = 0;
        for (int i=0; i<arr.length; i++){
            xorAll ^= arr[i];
        }
        int rsb = xorAll & -xorAll;

        for (int i=0; i<arr.length; i++){
            if((rsb & arr[i]) != 0){
                n1 ^= arr[i]; // Group 1
            }else {
                n2 ^= arr[i]; // Group 2
            }
        }
        System.out.println("N1 " + n1 + " N2 " + n2);

    }
}
