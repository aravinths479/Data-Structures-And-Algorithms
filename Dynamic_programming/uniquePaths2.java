//  tuf - https://www.youtube.com/watch?v=TmhpgXScLyY&list=PLgUwDviBIf0qUlt5H_kiKYaNSqJ81PMMY&index=10

// You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]). 
// The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). 
// The robot can only move either down or right at any point in time.

// An obstacle and space are marked as 1 or 0 respectively in grid. 
// A path that the robot takes cannot include any square that is an obstacle.

// Return the number of possible unique paths that the robot can take to reach the bottom-right corner.

// The testcases are generated so that the answer will be less than or equal to 2 * 109.


// Example 1:

// Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
// Output: 2
// Explanation: There is one obstacle in the middle of the 3x3 grid above.
// There are two ways to reach the bottom-right corner:
// 1. Right -> Right -> Down -> Down
// 2. Down -> Down -> Right -> Right


// Example 2:

// Input: obstacleGrid = [[0,1],[0,0]]
// Output: 1


package Dynamic_programming;

import java.util.Arrays;

public class uniquePaths2 {
    // Recursive function to calculate the number of unique paths
    // from (i, j) to (0, 0) in an obstacleGrid using memoization.
    public static int recursive(int i, int j, int[][] dp, int[][] obstacleGrid) {
        // Base case: If we reach the top-left corner, there's one unique path.
        if (i == 0 && j == 0) {
            return 1;
        }
        
        // If we go out of bounds or encounter an obstacle, there are no paths.
        if (i < 0 || j < 0 || obstacleGrid[j][i] == 1) {
            return 0;
        }
        
        // If the value for this cell is already computed, return it.
        if (dp[j][i] != 0) {
            return dp[j][i];
        }
        
        // Calculate the number of unique paths by moving up and moving left.
        int up = recursive(i, j - 1, dp, obstacleGrid);
        int left = recursive(i - 1, j, dp, obstacleGrid);
        
        // Store the result in the DP array and return it.
        dp[j][i] = left + up;
        return dp[j][i];
    }

    // Main function to find the number of unique paths in an obstacleGrid.
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        
        // Check if the starting cell is blocked by an obstacle
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        // Check if the destination cell is blocked by an obstacle
        if (obstacleGrid[n - 1][m - 1] == 1) {
            return 0;
        }

        int[][] dp = new int[n][m];

        // Initialize the DP array with zeros.
        for (int[] row : dp) {
            Arrays.fill(row, 0);
        }

        // Call the recursive function starting from the bottom-right corner.
        return recursive(m - 1, n - 1, dp, obstacleGrid);
    }

    public static void main(String[] args) {
        int grid[][] = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        
        // Call the uniquePathsWithObstacles function and print the result.
        System.out.println(uniquePathsWithObstacles(grid));
    }
}
