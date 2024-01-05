/*
 
There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, 
and city b is connected directly with city c, then city a is connected indirectly with city c.

A province is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are 
directly connected, and isConnected[i][j] = 0 otherwise.

Return the total number of provinces.

 

Example 1:


Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
Output: 2


Example 2:


Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
 

 */


package Graphs;
import java.util.*;
public class NumberOfProvinces {

    public static void dfs(int node, List<List<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        for (int i : adj.get(node)) {
            if (!visited[i]) {
                dfs(i, adj, visited);
            }
        }
    }

    // Method to find the number of provinces
    public static int findCircleNum(int[][] isConnected) {
        // Initialize adjacency list and other variables
        List<List<Integer>> adj = new ArrayList<>();
        int n = isConnected.length;
        int provinces = 0;

        // Create an empty adjacency list
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // Populate adjacency list based on the isConnected matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Add an edge if there is a connection (1) and i is not equal to j
                if (isConnected[i][j] == 1 && i != j) {
                    adj.get(i).add(j);
                }
            }
        }

        // Array to track visited nodes during DFS
        boolean[] visited = new boolean[isConnected.length];

        // Perform DFS and count the number of provinces
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                provinces++;
                dfs(i, adj, visited);
            }
        }

        // Return the number of provinces
        return provinces;
    }
     public static void main(String[] args) {
        int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        System.out.println(findCircleNum(isConnected));
        
    }
}
