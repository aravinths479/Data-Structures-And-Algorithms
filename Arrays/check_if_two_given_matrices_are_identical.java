import java.util.*;

public class check_if_two_given_matrices_are_identical {

    static boolean check(int arr1[][], int arr2[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /*
     * Example:
     * 
     * int[] array1 = { 1, 2, 3 };
     * int[] array2 = { 1, 2, 3 };
     * boolean areEqual = Arrays.equals(array1, array2);
     * System.out.println("Arrays are equal: " + areEqual); // Output: Arrays are
     * equal: true
     * works only for 1D array
     * 
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[][] = new int[n][n];
        int arr2[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        boolean res = check(arr1, arr2, n);

        if (res) {
            System.out.println("Matrix are identical");
        } else {
            System.out.println("Matrix are not identical");
        }

    }

}
