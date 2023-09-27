// https://www.youtube.com/watch?v=JXU4Akft7yk&list=PLgUwDviBIf0pMFMWuuvDNMAkoQFi-h0ZF&index=26

// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

// Example 1:

// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true


// Example 2:

// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
// Output: false


package searching_Techniques.Binary_Search;

public class search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = (m*n) - 1;

        while(low<=high){
            int mid = (low+high)/2;
            int row = mid / n;
            int col = mid % n;
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
}
