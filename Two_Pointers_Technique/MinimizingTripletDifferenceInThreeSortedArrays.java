// problem 2  https://www.youtube.com/watch?v=ijKmiFqjzi4
// https://www.geeksforgeeks.org/minimize-maxai-bj-ck-minai-bj-ck-three-different-sorted-arrays/

// Input : A : [ 1, 4, 5, 8, 10 ]
//         B : [ 6, 9, 15 ]
//         C : [ 2, 3, 6, 6 ]
// Output : 1

// Start with the largest elements in each of the arrays A, B & C. Maintain a variable to update the answer during each of the steps to be followed. 
// In every step, the only possible way to decrease the difference is to decrease the maximum element out of the three elements. 
// So traverse to the next largest element in the array containing the maximum element for this step and update the answer variable. 
// Repeat this step until the array containing the maximum element ends. 



package Two_Pointers_Technique;

public class MinimizingTripletDifferenceInThreeSortedArrays {

    public static int solve(int[] A, int[] B, int[] C)
    {
        int i, j, k;
         
        // assigning the length -1 value
        // to each of three variables
        i = A.length - 1;
        j = B.length - 1;
        k = C.length - 1;
         
        int min_diff, current_diff, max_term;
 
        // calculating min difference
        // from last index of lists
        min_diff = Math.abs(Math.max(A[i], Math.max(B[j], C[k]))
                - Math.min(A[i], Math.min(B[j], C[k])));
 
        while (i != -1 && j != -1 && k != -1)
        {
            current_diff = Math.abs(Math.max(A[i], Math.max(B[j], C[k]))
                        - Math.min(A[i], Math.min(B[j], C[k])));
 
            // checking condition
            if (current_diff < min_diff)
                min_diff = current_diff;
 
            // calculating max term from list
            max_term = Math.max(A[i], Math.max(B[j], C[k]));
 
            // Moving to smaller value in the
            // array with maximum out of three.
            if (A[i] == max_term)
                i -= 1;
            else if (B[j] == max_term)
                j -= 1;
            else
                k -= 1;
        }
        return min_diff;
    }
 
    // Driver code
    public static void main(String []args)
    {
    
        int[] D = { 5, 8, 10, 15 };
        int[] E = { 6, 9, 15, 78, 89 };
        int[] F = { 2, 3, 6, 6, 8, 8, 10 };
        System.out.println(solve(D, E, F));
         
    }
}
