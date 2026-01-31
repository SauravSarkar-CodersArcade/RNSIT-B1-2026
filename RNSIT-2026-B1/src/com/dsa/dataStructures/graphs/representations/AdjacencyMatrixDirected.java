package com.dsa.dataStructures.graphs.representations;
import java.util.Scanner;
public class AdjacencyMatrixDirected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n -> number of nodes
        // m -> number of edges
        // Do we cover/traverse all the nodes (TC) O(n)
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] adjMatrix = new int[n+1][n+1]; // For 0-based indexing
        // Take the edges as input from the user
        for (int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            // Undirected -> (u <--> v) both ways
            adjMatrix[u][v] = 1;
            // adjMatrix[v][u] = 1; // Skip this for a directed graph
        }
        // Print the Adjacency Matrix
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
