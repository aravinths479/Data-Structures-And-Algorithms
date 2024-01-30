/*
 
Input : mat[][] = [[11, 2, 4],
                   [4 ,5 ,6],
                  [10, 8 ,-12]] 
Output : 15

Sum of primary diagonal = 11 + 5 + (-12) = 4.
Sum of secondary diagonal = 4 + 5 + 10 = 19.
Difference = |19 - 4| = 15.


Input : mat[][] = [[10 ,2],
                   [4 ,5]]
Output : 9

 */

import java.util.*;

public class sum_of_two_diagonals_difference {
    public static void calc(int arr[][], int n) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum = sum + arr[i][j];
                }
                if ((i + j) == n - 1) {
                    sum2 = sum2 + arr[i][j];
                }
            }
        }
        System.out.println("Difference  :  " + Math.abs(sum - sum2));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        calc(arr, n);
    }
}
