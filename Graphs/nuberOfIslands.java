/**
 Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), 
 return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
You may assume all four edges of the grid are all surrounded by water.

 
Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1


Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3


 */
package Graphs;

public class nuberOfIslands {

    public static void dfs(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Base case: check if the current cell is out of bounds or already visited
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == '0') {
            return;
        }

        // Mark the current cell as visited
        grid[i][j] = '0';

        // Explore neighboring cells in all directions
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
    }

    // Function to count the number of islands in the grid
    public static int numIslands(char[][] grid) {
        // Check if the grid is null or empty
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numOfIslands = 0;

        // Iterate through each cell in the grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // If the cell contains '1', increment the number of islands and perform DFS
                if (grid[i][j] == '1') {
                    numOfIslands++;
                    dfs(grid, i, j);
                }
            }
        }

        // Return the total number of islands
        return numOfIslands;
    }

    // Main function for testing
    public static void main(String[] args) {

        // Example usage
        char[][] grid = {
                { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' }
        };

        int result = numIslands(grid);
        System.out.println("Number of Islands: " + result);
    }
}