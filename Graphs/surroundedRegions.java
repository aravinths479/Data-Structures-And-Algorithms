/*
 
Given an m x n matrix board containing 'X' and 'O', capture all regions that are 4-directionally surrounded by 'X'.

A region is captured by flipping all 'O's into 'X's in that surrounded region.

 

Example 1:


Input: board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
Output: [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]

Explanation: Notice that an 'O' should not be flipped if:
- It is on the border, or
- It is adjacent to an 'O' that should not be flipped.
The bottom 'O' is on the border, so it is not flipped.
The other three 'O' form a surrounded region, so they are flipped.


Example 2:

Input: board = [["X"]]
Output: [["X"]]

 */

package Graphs;

import java.util.Arrays;

public class surroundedRegions {

    // Depth-First Search (DFS) function to explore 'O' regions and mark them
    public static void dfs(char[][] board, int i, int j) {
        // Base case: check if the current cell is out of bounds or not 'O'
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {
            return;
        }
        // Mark the current cell as visited
        board[i][j] = '*';
        // Explore neighboring cells in all directions
        dfs(board, i + 1, j);
        dfs(board, i, j + 1);
        dfs(board, i - 1, j);
        dfs(board, i, j - 1);
    }

    public static void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;

        // Step 1: Explore 'O' regions on the left and right boundaries
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0);
            }
            if (board[i][col - 1] == 'O') {
                dfs(board, i, col - 1);
            }
        }

        // Step 2: Explore 'O' regions on the top and bottom boundaries
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == 'O') {
                dfs(board, 0, i);
            }
            if (board[row - 1][i] == 'O') {
                dfs(board, row - 1, i);
            }
        }

        // Step 3: Flip 'O' to 'X' and revert '*' back to 'O'
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    /*
     * 
     * problem is similar to the "Number of Islands" problem:
     * 
     * 1. **Identify Boundary 'O's**: Start by traversing the boundary of the matrix
     * and perform Depth-First Search (DFS)
     * from each 'O' cell on the boundary, marking connected 'O' cells as '*'.
     * 
     * 2. **Explore Boundary 'O' Neighbors**: Explore the top, bottom, left, and
     * right neighbors of each 'O' cell on the boundary.
     * Mark all connected 'O' cells using DFS.
     * 
     * 3. **Flip and Revert**: After marking all connected 'O' cells, iterate
     * through the matrix.
     * Flip remaining 'O' cells to 'X', and revert marked '*' cells back to 'O'.
     * 
     * 4. **Final Result**: The modified matrix contains the surrounded regions,
     * with 'X' representing the regions surrounded by 'X' and 'O' representing the
     * regions connected to the boundaries.
     * 
     */

    public static void main(String[] args) {
        char[][] board = { { 'X', 'X', 'X', 'X' }, { 'X', 'O', 'O', 'X' }, { 'X', 'X', 'O', 'X' },
                { 'X', 'O', 'X', 'X' } };

        // Solve the surrounded regions problem
        solve(board);

        // Print the final board
        for (char i[] : board) {
            System.out.println(Arrays.toString(i));
        }
    }
}
