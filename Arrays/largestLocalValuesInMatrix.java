/*
 
You are given an n x n integer matrix grid.

Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:

maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.

Return the generated matrix.

 

Example 1:


Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
Output: [[9,9],[8,6]]
Explanation: The diagram above shows the original matrix and the generated matrix.
Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.


Example 2:

Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
Output: [[2,2,2],[2,2,2],[2,2,2]]
Explanation: Notice that the 2 is contained within every contiguous 3 x 3 matrix in grid.

 */

import java.util.*;

public class largestLocalValuesInMatrix {
    // Helper method to iterate through a 3x3 submatrix and find the maximum value
    public static int iterate(int arr[][], int i, int j) {
        int max = Integer.MIN_VALUE;
        for (int a = i; a <= i + 2; a++) {
            for (int b = j; b <= j + 2; b++) {
                // Update max with the maximum value in the current submatrix
                max = Math.max(max, arr[a][b]);
            }
        }
        return max;
    }

    // Main method to generate the largest local values matrix
    public static int[][] largestLocal(int[][] grid) {
        // Resulting matrix to store the largest local values
        int[][] res = new int[grid.length - 2][grid[0].length - 2];

        // Iterate through the grid to calculate the largest local values
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                // Calculate and store the maximum value in the current 3x3 submatrix
                res[i][j] = iterate(grid, i, j);
            }
        }

        // Return the resulting matrix containing the largest local values
        return res;
    }
    public static void main(String[] args) {
        int[][] grid = {
            {9,9,8,1},
            {5,6,2,6},
            {8,2,6,4},
            {6,2,2,2}
        };
        int[][] res = largestLocal(grid);
        for(int i[]:res){
            System.out.println(Arrays.toString(i));
        }
    }
}
