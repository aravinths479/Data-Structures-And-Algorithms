import java.util.ArrayList;
import java.util.List;

class test2 {
    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        // Convert the matrix to an adjacency list
        List<List<Integer>> adjacencyList = matrixToAdjacencyList(isConnected);

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(adjacencyList, visited, i);
                provinces++;
            }
        }

        return provinces;
    }

    private static void dfs(List<List<Integer>> adjacencyList, boolean[] visited, int city) {
        visited[city] = true;

        for (int neighbor : adjacencyList.get(city)) {
            if (!visited[neighbor]) {
                dfs(adjacencyList, visited, neighbor);
            }
        }
    }

    private static List<List<Integer>> matrixToAdjacencyList(int[][] matrix) {
        int n = matrix.length;
        List<List<Integer>> adjacencyList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1 && i != j) {
                    adjacencyList.get(i).add(j);
                }
            }
        }
        System.out.println(adjacencyList);
        return adjacencyList;
    }
    public static void main(String[] args) {
        int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(findCircleNum(isConnected));
    }
}
