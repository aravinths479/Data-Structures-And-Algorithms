// visit notes

// Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, 
// which minimizes the sum of all numbers along its path.

// Note: You can only move either down or right at any point in time.

 

// Example 1:

// Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
// Output: 7
// Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.


// Example 2:

// Input: grid = [[1,2,3],[4,5,6]]
// Output: 12


package Dynamic_programming;

public class minimumPathSum {
    public static int minPathSum(int[][] grid) {
        // Create a DP array to store the minimum path sum
        int dp[][] = new int[grid.length][grid[0].length]; // DP array with dimensions matching the grid
        
        // Initialize the top-left cell of the DP array
        dp[0][0] = grid[0][0];

        // Initialize the first column of the DP array
        for(int i = 1; i < grid.length; i++) {
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }

        // Initialize the first row of the DP array
        for(int i = 1; i < grid[0].length; i++) {
            dp[0][i] = grid[0][i] + dp[0][i-1];
        }

        // Calculate minimum path sum for the remaining cells in the DP array
        for(int i = 1; i < grid.length; i++) {
            for(int j = 1; j < grid[0].length; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
            }
        }
        
        // Return the minimum path sum which is stored in the bottom-right cell of the DP array
        return dp[grid.length - 1][grid[0].length - 1];
    }

    public static void main(String[] args) {
        int arr[][] = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(arr));
    }
}
