package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
    // Method to perform Breadth-First Search on a graph
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[V];
        queue.offer(0); // Start BFS from node 0
        visited[0] = true;

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            res.add(currentNode);

            // Visit all adjacent nodes of the current node
            for (Integer i : adj.get(currentNode)) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
        return res; // Return the result of BFS traversal
    }

    public static void main(String[] args) {
        // Creating an instance of the BFSGraph class
        BFSGraph bfsGraph = new BFSGraph();

        // Creating an example adjacency list representing a graph
        int numNodes = 5;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(numNodes);

        for (int i = 0; i < numNodes; i++) {
            adjList.add(new ArrayList<>());
        }

        // Adding edges to the graph
        adjList.get(0).add(1);
        adjList.get(0).add(2);
        adjList.get(1).add(0);
        adjList.get(1).add(3);
        adjList.get(2).add(0);
        adjList.get(2).add(3);
        adjList.get(2).add(4);
        adjList.get(3).add(1);
        adjList.get(3).add(2);
        adjList.get(3).add(4);
        adjList.get(4).add(2);
        adjList.get(4).add(3);

        // Calling bfsOfGraph and printing the result
        System.out.println("BFS starting from node 0:");
        ArrayList<Integer> result = bfsGraph.bfsOfGraph(numNodes, adjList);
        System.out.println(result);
    }
}
