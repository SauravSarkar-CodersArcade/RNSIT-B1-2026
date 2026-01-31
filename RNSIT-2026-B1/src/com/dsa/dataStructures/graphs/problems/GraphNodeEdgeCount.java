package com.dsa.dataStructures.graphs.problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class GraphNodeEdgeCount {
    public static int countNodes( List<List<Integer>> adjList){
        return adjList.size();
    }
    public static int countEdges( List<List<Integer>> adjList){
        int edges = 0;
        for (List<Integer> neighbour : adjList){
            edges += neighbour.size();
        }
        return edges / 2; // Because each edge is counted twice (undirected graph)
    }
    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        // Manually Adding the nodes to the list
        adjList.add(Arrays.asList(1,2)); // Node 0 - {1,2} - 2
        adjList.add(Arrays.asList(0,2,3)); // Node 1 > 3
        adjList.add(Arrays.asList(0,1,4)); // Node 2 > 3
        adjList.add(Arrays.asList(1,4)); // Node 3 > 2
        adjList.add(Arrays.asList(2,3)); // Node 4 > 2
        int nodes = countNodes(adjList);
        int edges = countEdges(adjList);
        System.out.println("Nodes: " + nodes);
        System.out.println("Edges: " + edges);
    }
}
