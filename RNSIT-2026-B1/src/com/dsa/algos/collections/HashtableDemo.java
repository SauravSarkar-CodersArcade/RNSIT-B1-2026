package com.dsa.algos.collections;
import java.util.Hashtable;
import java.util.Map;
public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Praveen");
        ht.put(117, "Suhan");
        ht.put(128, "Aishwarya");
        ht.put(99, "Aishwarya P");
        ht.put(100, "Sushwanth");
        for(Map.Entry<Integer, String> entry : ht.entrySet()){
            System.out.println(entry.getKey() + "<->" + entry.getValue());
        }
    }
}
