/*
 
You are given an m x n grid where each cell can have one of three values:

0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

 

Example 1:

Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
Output: 4


Example 2:

Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
Output: -1
Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, 
because rotting only happens 4-directionally.


Example 3:

Input: grid = [[0,2]]
Output: 0
Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.

 */


package Graphs;

import java.util.*;

public class rottenOranges {
    public static int orangesRotting(int grid[][]) {

        // Initialize a queue to perform BFS
        Queue<int[]> queue = new LinkedList<>();

        // Count the number of fresh oranges
        int freshOranges = 0;

        // Iterate through the grid to find fresh and rotten oranges
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    freshOranges++;
                }
                if (grid[i][j] == 2) {
                    // Add the position of the rotten orange to the queue
                    queue.offer(new int[] { i, j });
                }
            }
        }

        // Initialize the variable to count minutes
        int mins = 0;

        // Perform BFS while there are fresh oranges and the queue is not empty
        while (!queue.isEmpty() && freshOranges > 0) {

            // Possible directions to move (up, down, left, right)
            int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

            // Store the current size of the queue to process oranges level by level
            int size = queue.size();

            // Process all oranges at the current level
            for (int i = 0; i < size; i++) {
                // Retrieve the current position from the queue
                int[] currentPos = queue.poll();

                // Explore all possible directions
                for (int[] direction : directions) {
                    int newRow = currentPos[0] + direction[0];
                    int newCol = currentPos[1] + direction[1];

                    // Check if the new position is within the grid boundaries and has a fresh orange
                    if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length
                            && grid[newRow][newCol] == 1) {
                        // Mark the orange as rotten, decrement freshOranges count, and add to the queue
                        freshOranges--;
                        grid[newRow][newCol] = 2;
                        queue.offer(new int[] { newRow, newCol });
                    }
                }
            }

            // Increment the minutes after processing each level
            mins++;
        }

        // If all oranges can be rotted, return the total minutes; otherwise, return -1
        return freshOranges == 0 ? mins : -1;
    }

    public static void main(String[] args) {

        // Example usage
        int[][] grid = {
                { 2, 1, 1 },
                { 1, 1, 0 },
                { 0, 1, 1 }
        };

        int result = orangesRotting(grid);
        System.out.println("Minimum time required for all oranges to rot: " + result);
    }
}
