// tuf - https://www.youtube.com/watch?v=sdE0A2Oxofw&list=PLgUwDviBIf0qUlt5H_kiKYaNSqJ81PMMY&index=9

// There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). 
// The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). 
// The robot can only move either down or right at any point in time.

// Given the two integers m and n, return the number of possible unique paths that the robot can take to reach 
// the bottom-right corner.

// The test cases are generated so that the answer will be less than or equal to 2 * 109.

 
// Example 1:


// Input: m = 3, n = 7
// Output: 28


// Example 2:

// Input: m = 3, n = 2
// Output: 3
// Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
// 1. Right -> Down -> Down
// 2. Down -> Down -> Right
// 3. Down -> Right -> Down

package Dynamic_programming;

import java.util.Arrays;

public class uniquePaths {
    // Recursive function to calculate the number of unique paths
    // from (i, j) to (0, 0) using memoization.
    public static int recursive(int i, int j, int[][] dp) {
        // Base case: If we reach the top-left corner, there's one unique path.
        if (i == 0 && j == 0) {
            return 1;
        }
        
        // If we go out of bounds, there are no paths.
        if (i < 0 || j < 0) {
            return 0;
        }
        
        // If the value for this cell is already computed, return it.
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        
        // Calculate the number of unique paths by moving up and moving left.
        int up = recursive(i, j - 1, dp);
        int left = recursive(i - 1, j, dp);
        
        // Store the result in the DP array and return it.
        dp[i][j] = left + up;
        return dp[i][j];
    }

    // Main function to find the number of unique paths in an m x n grid.
    public static int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        
        // Initialize the DP array with zeros.
        for (int[] row : dp) {
            Arrays.fill(row, 0);
        }
        
        // Start the recursive calculation from the bottom-right corner.
        int res =  recursive(m - 1, n - 1, dp);
        for(int i[]:dp){

            System.out.println(Arrays.toString(i));
        }
        return res;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        
        // Call the uniquePaths function and print the result.
        System.out.println(uniquePaths(m, n));
        
    }
}
