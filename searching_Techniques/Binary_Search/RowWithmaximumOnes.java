//  https://www.youtube.com/watch?v=SCz-1TtYxDI&list=PLgUwDviBIf0pMFMWuuvDNMAkoQFi-h0ZF&index=25


// Given a m x n binary matrix mat, find the 0-indexed position of the row that contains the maximum count of ones, 
// and the number of ones in that row.

// In case there are multiple rows that have the maximum count of ones, 
// the row with the smallest row number should be selected.

// Return an array containing the index of the row, and the number of ones in it.

 

// Example 1:

// Input: mat = [[0,1],[1,0]]
// Output: [0,1]
// Explanation: Both rows have the same number of 1's. So we return the index of the smaller row, 0, and the maximum count of ones (1). So, the answer is [0,1]. 

// Example 2:

// Input: mat = [[0,0,0],[0,1,1]]
// Output: [1,2]
// Explanation: The row indexed 1 has the maximum count of ones (2). So we return its index, 1, and the count. So, the answer is [1,2].

// Example 3:

// Input: mat = [[0,0],[1,1],[0,0]]
// Output: [1,2]
// Explanation: The row indexed 1 has the maximum count of ones (2). So the answer is [1,2].

package searching_Techniques.Binary_Search;

import java.util.*;
public class RowWithmaximumOnes {
    public static int Binary_Search(int mat[][],int i){
        int low = 0;
        int high = mat[i].length;
        //int count = 0;
        while(low<high){
            int mid = (low+high)/2;
            if(mat[i][mid]==1){
                high = mid-1;
               // count++;
            }
            else{
                low = mid+1;
            }
        }
        int count = mat[i].length - high;
        return count-1;
    }
    public static int[] rowAndMaximumOnes(int[][] mat){
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0;i<mat.length;i++){
            int res = Binary_Search(mat, i);
            if(max<res){
                index = i;
                max = res;
            }
        }

        return new int[] {index,max};
    }
    public static void main(String[] args) {
        int arr[][] = {{0,0},{1,1},{0,0}};
        System.out.println(Arrays.toString(rowAndMaximumOnes(arr)));
    }
}
