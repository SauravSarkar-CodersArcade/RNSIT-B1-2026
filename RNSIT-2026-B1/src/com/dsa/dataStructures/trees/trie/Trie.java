package com.dsa.dataStructures.trees.trie;

import java.util.Arrays;
import java.util.List;

class TrieNode {
    TrieNode[] children;
    boolean wordEnd;
    TrieNode(){
        wordEnd = false;
        children = new TrieNode[26]; // Alphabets a to z
    }
}
public class Trie {
    public static void insertWord(TrieNode root, String word){
        TrieNode curr = root;
        // "Anusha" => {'A','n','u','s','h','a'};
        for (char c : word.toCharArray()){
            if(curr.children[c-'a'] == null){
                // null means node is not present
                // So we will create a new node
                curr.children[c-'a'] = new TrieNode();
            }
            // Move to the children node for the next character
            curr = curr.children[c-'a'];
        }
        curr.wordEnd = true; // We have stored the word
    }
    public static boolean searchWord(TrieNode root, String word){
        TrieNode curr = root;
        for (char c : word.toCharArray()){
            if(curr.children[c-'a'] == null){
                // Node is not present in the trie
                return false;
            }
            // Move to the next character
            curr = curr.children[c-'a'];
        }
        return curr.wordEnd; // If true exists, else no
    }
    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        List<String> inputWords = Arrays.
                asList("aishwarya", "abhijeeth", "thanusha",
                        "suhan", "praveen");
        for (String s : inputWords){
            insertWord(root, s);
        }
        List<String> searchWords = Arrays.
                asList("aishwarya", "saurav", "abhijeeth", "thanusha",
                        "suhan", "nirmal", "praveen",
                        "divyansh");
        for (String s : searchWords){
            if(searchWord(root, s)){
                System.out.println(s + " present in trie.");
            }else {
                System.out.println(s + " not present in trie.");
            }
        }
    }
}
