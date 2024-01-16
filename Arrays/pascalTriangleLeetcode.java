/*
 
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]


Example 2:

Input: numRows = 1
Output: [[1]]

 */

import java.util.ArrayList;
import java.util.List;

public class pascalTriangleLeetcode {
    public static List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
    
            if (numRows == 0) {
                return result;
            }
    
            // First row
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            result.add(firstRow);
    
            for (int i = 1; i < numRows; i++) {
                List<Integer> prevRow = result.get(i - 1);
                List<Integer> currentRow = new ArrayList<>();
    
                // First element of the row is always 1
                currentRow.add(1);
    
                for (int j = 1; j < i; j++) {
                    // Middle elements are the sum of the two elements above them
                    currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
                }
    
                // Last element of the row is always 1
                currentRow.add(1);
    
                result.add(currentRow);
            }
    
            return result;
    }
    public static void main(String[] args) {
        
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);

        // Print the result
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
