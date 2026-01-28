package com.dsa.algos.collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class HashMapExample {
    // How do we maintain insertion order in an HashMap ? LinkedHashMap
    public static void main(String[] args) {
        HashMap<String, String> hm = new LinkedHashMap<>();
        hm.put("bbbb", "2222");
        hm.put("aaaa", "1111");
        hm.put("cccc", "3333");
        hm.put("dddd", "4444");
        for (Map.Entry<String, String> entry : hm.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
