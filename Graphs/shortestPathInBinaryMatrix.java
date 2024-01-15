/*
 Given an n x n binary matrix grid, return the length of the shortest clear path in the matrix. 
 If there is no clear path, return -1.

A clear path in a binary matrix is a path from the top-left cell 
(i.e., (0, 0)) to the bottom-right cell (i.e., (n - 1, n - 1)) such that:

All the visited cells of the path are 0.

All the adjacent cells of the path are 8-directionally connected 
(i.e., they are different and they share an edge or a corner).
The length of a clear path is the number of visited cells of this path.

 

Example 1:

Input: grid = [[0,1],[1,0]]
Output: 2


Example 2:

Input: grid = [[0,0,0],[1,1,0],[1,1,0]]
Output: 4


Example 3:

Input: grid = [[1,0,0],[1,1,0],[1,1,0]]
Output: -1

 */

package Graphs;

import java.util.*;

public class shortestPathInBinaryMatrix {
    public static int shortestPathBinaryMatrix(int[][] grid) {

        // Check if the starting point is invalid
        if (grid[0][0] == 1) {
            return -1; // Invalid starting point
        }

        // Get the number of rows and columns in the grid
        int row = grid.length;
        int col = grid[0].length;

        // Create a queue for BFS traversal
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1}); // Start from top-left corner with distance 1

        // Define the eight possible directions to move
        int[][] directions = {{0, -1}, {-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}};

        // Perform BFS traversal
        while (!queue.isEmpty()) {
            int currentPosition[] = queue.poll();
            int distance = currentPosition[2];

            // Check if the current position is the bottom-right corner
            if (currentPosition[0] == row - 1 && currentPosition[1] == col - 1) {
                return distance; // Reached the bottom-right corner
            }

            // Explore all possible directions from the current position
            for (int[] direction : directions) {
                int newRow = direction[0] + currentPosition[0];
                int newCol = direction[1] + currentPosition[1];

                // Check if the new position is within the grid and has not been visited
                if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < col && grid[newRow][newCol] == 0) {
                    queue.offer(new int[]{newRow, newCol, distance + 1}); // Add the new position to the queue
                    grid[newRow][newCol] = 1; // Mark the position as visited
                }
            }
        }

        return -1; // No valid path found
    
    }
    public static void main(String[] args) {
    //     int[][] grid1 = {
    //         {0, 1},
    //         {1, 0}
    // };
    // System.out.println("Shortest clear path length: " + shortestPathBinaryMatrix(grid1));

    int[][] grid2 = {
            {0, 0, 0},
            {1, 1, 0},
            {1, 1, 0}
    };
    System.out.println("Shortest clear path length: " + shortestPathBinaryMatrix(grid2));

    // int[][] grid3 = {
    //         {1, 0, 0},
    //         {1, 1, 0},
    //         {1, 1, 0}
    // };
    // System.out.println("Shortest clear path length: " + shortestPathBinaryMatrix(grid3));

    }
}
