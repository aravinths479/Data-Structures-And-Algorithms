// notes 


// Given a triangle array, return the minimum path sum from top to bottom.

// For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.

 

// Example 1:

// Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
// Output: 11
// Explanation: The triangle looks like:
//    2
//   3 4
//  6 5 7
// 4 1 8 3
// The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
// Example 2:

// Input: triangle = [[-10]]
// Output: -10

package Dynamic_programming;

import java.util.*;

public class triangle{
    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        
        int dp[][] = new int[n][n];

        for(int i=0;i<n;i++){
            dp[n-1][i] = triangle.get(n-1).get(i);
        }
        
        for(int row = n-2;row>=0 ;row--){
            for(int col = 0; col<=row; col++){
                dp[row][col] = Math.min(dp[row+1][col],dp[row+1][col+1]) + triangle.get(row).get(col);
            }
        }

        return dp[0][0];
    }
    public static void main(String[] args) {
        List<List<Integer>> lst =new  ArrayList<>();

        lst.add(new ArrayList<>(Arrays.asList(2)));
        lst.add(new ArrayList<>(Arrays.asList(3, 4)));
        lst.add(new ArrayList<>(Arrays.asList(6, 5, 7)));
        lst.add(new ArrayList<>(Arrays.asList(4, 1, 8, 3)));

        System.out.println(minimumTotal(lst));

    }
}