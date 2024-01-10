/*
 
 Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.


Example 1:

Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

 */


import java.util.*;


public class setMatricesZero {
    public static void setZeroes(int[][] matrix) {
        // Create arrays to store information about which rows and columns need to be set to zero
        int row[] = new int[matrix.length]; 
        int col[] = new int[matrix[0].length];

        // Iterate through the matrix to identify rows and columns with zeros
        for(int i=0; i < matrix.length; i++) {
            for(int j=0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = 1;  // Mark the row for later zeroing
                    col[j] = 1;  // Mark the column for later zeroing
                }
            }
        }

        // Set entire rows and columns to zero based on the marked rows and columns
        for(int i=0; i < matrix.length; i++) {
            for(int j=0; j < matrix[0].length; j++) {
                if(row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("\nMatrix after setting zeroes:");
        printMatrix(matrix);
    }

    // Helper method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
