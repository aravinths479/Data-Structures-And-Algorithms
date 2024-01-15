/*
 
You are given an m x n binary matrix grid, where 0 represents a sea cell and 1 represents a land cell.

A move consists of walking from one land cell to another adjacent 
(4-directionally) land cell or walking off the boundary of the grid.

Return the number of land cells in grid for which we cannot walk off the boundary of the grid in any number of moves.

 

Example 1:


Input: grid = [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
Output: 3
Explanation: There are three 1s that are enclosed by 0s, and one 1 that is not enclosed because its on the boundary.

Example 2:

Input: grid = [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
Output: 0
Explanation: All 1s are either on the boundary or can reach the boundary.

 */

package Graphs;

public class numberOfEnclaves {
    public static void dfs(int[][] grid, int i, int j) {
        // Base case: check if the current cell is out of bounds or not 'O'
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1) {
            return;
        }
        // Mark the current cell as visited
        grid[i][j] = -1;
        // Explore neighboring cells in all directions
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
    }

    // Method to count the number of remaining 'O' cells after exploration
    public static int numEnclaves(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        // Step 1: Explore 'O' regions on the left and right boundaries
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 1) {
                dfs(grid, i, 0);
            }
            if (grid[i][col - 1] == 1) {
                dfs(grid, i, col - 1);
            }
        }

        // Step 2: Explore 'O' regions on the top and bottom boundaries
        for (int i = 0; i < grid[0].length; i++) {
            if (grid[0][i] == 1) {
                dfs(grid, 0, i);
            }
            if (grid[row - 1][i] == 1) {
                dfs(grid, row - 1, i);
            }
        }

        // Step 3: Count remaining 'O' cells
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 0, 0},
            {1, 0, 1, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 0}
        };

        System.out.println(numEnclaves(grid));
    }
}
