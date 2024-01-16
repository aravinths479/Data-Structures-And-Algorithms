package Graphs;

import java.util.*;

public class DFSGraph {

    // DFS traversal method
    public static void dfs(int node, ArrayList<ArrayList<Integer>> lst, ArrayList<Integer> res, boolean[] visited) {
        // Mark the current node as visited
        visited[node] = true;
        
        // Add the current node to the result list
        res.add(node);
        
        // Explore neighbor s of the current node
        for (int i : lst.get(node)) {
            if (!visited[i]) {
                dfs(i, lst, res, visited);
            }
        }
    }

    // DFS of the entire graph starting from a specific node
    public static List<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> lst, int startingNode) {
        ArrayList<Integer> res = new ArrayList<>();
        
        // Initialize visited array
        boolean visited[] = new boolean[lst.size()];

        // Perform DFS traversal
        dfs(startingNode, lst, res, visited);

        return res;
    }

    public static void main(String[] args) {
        // Create an adjacency list representing the graph
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();

        for (int i = 0; i <= 8; i++) {
            lst.add(new ArrayList<>());
        }

        // Add edges to the graph
        lst.get(1).add(2);
        lst.get(1).add(3);

        lst.get(2).add(5);
        lst.get(2).add(6);

        lst.get(3).add(4);
        lst.get(3).add(7);

        lst.get(4).add(3);
        lst.get(4).add(8);

        lst.get(5).add(2);

        lst.get(6).add(2);

        lst.get(7).add(3);
        lst.get(7).add(8);

        lst.get(8).add(4);
        lst.get(8).add(7);

        // Perform DFS traversal starting from node 0
        System.out.println(dfsOfGraph(lst, 1));
    }
}
