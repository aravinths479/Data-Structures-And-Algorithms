import java.util.LinkedList;
import java.util.Queue;

public class BFSExample {
    // Assuming the graph is represented using an adjacency matrix
    private static void bfs(int[][] graph, int startNode) {
        int numNodes = graph.length;
        boolean[] visited = new boolean[numNodes];
        Queue<Integer> queue = new LinkedList<>();

        // Mark the start node as visited and enqueue it
        visited[startNode] = true;
        queue.offer(startNode);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            // Visit all adjacent nodes of the current node
            for (int neighbor = 0; neighbor < numNodes; neighbor++) {
                if (graph[currentNode][neighbor] == 1 && !visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example adjacency matrix representing a graph
        int[][] graph = {
            {0, 1, 1, 0, 0},
            {1, 0, 0, 1, 0},
            {1, 0, 0, 1, 1},
            {0, 1, 1, 0, 1},
            {0, 0, 1, 1, 0}
        };

        // Start BFS from node 0
        System.out.println("BFS starting from node 0:");
        bfs(graph, 0);
    }
}
