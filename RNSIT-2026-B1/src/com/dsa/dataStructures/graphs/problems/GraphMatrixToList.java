package com.dsa.dataStructures.graphs.problems;
import java.util.ArrayList;
import java.util.List;
public class GraphMatrixToList {
    static List<List<Integer>> convertToAdjList(int[][] adjMatrix, int V){
        List<List<Integer>> adjList = new ArrayList<>();
        // Initialise the list with empty lists for each node
        for (int i=0; i<V; i++){
            adjList.add(new ArrayList<>());
        }
        // Convert matrix to list
        for (int i=0; i<V; i++){
            for (int j=0; j<V; j++){
                if(adjMatrix[i][j] == 1){ // There is an edge from i->j
                    adjList.get(i).add(j);
                }
            }
        }
        return adjList;
    }
    static void printAdjList(List<List<Integer>> adjList){
        for (int i=0; i< adjList.size(); i++){
            System.out.print("Node: " + (i+1) + " Neighbours: ");
            for (int j=0; j<adjList.get(i).size(); j++){
                System.out.print(adjList.get(i).get(j)+1 + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int V = 5;
        int[][] adjMatrix = {
                {0,1,1,1,0},
                {1,0,0,1,0},
                {1,0,0,1,1},
                {1,1,1,0,1},
                {0,0,1,1,0}
        };
        List<List<Integer>> adjList = convertToAdjList(adjMatrix, V);
        printAdjList(adjList);
    }
}
