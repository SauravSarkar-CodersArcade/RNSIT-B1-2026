package com.dsa.dataStructures.graphs.representations;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AdjacencyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n -> number of nodes
        // m -> number of edges
        // Do we cover/traverse all the nodes (TC) O(n)
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> adjList = new ArrayList<>();
        // Initialize the adjacency list with empty lists in the beginning
        // {1}{  } {2}{  }
        for(int i=0; i<=n; i++){
            adjList.add(new ArrayList<>());
        }
        // Read the input from the user
        for(int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v);
            adjList.get(v).add(u); // Skip this for a directed graph
        }
        // Print the adjacency list
        for (int i=1; i<=n; i++){
            System.out.print("Node: " + i + " Neighbours: ");
            for (int v : adjList.get(i)){
                System.out.print(v + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
