

import java.util.*;
public class transpose_of_a_matrix {
    static int[][] transpose(int arr[][],int n){
        int arr2[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[j][i] = arr[i][j];
            }
        }
        return arr2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int res[][] = transpose(arr,n);


        // 2d for each
        for(int[] i:res){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


// // Java Program to find
// // transpose of a matrix

// class transpose_of_a_matrix {
// 	static final int N = 4;

// 	// Finds transpose of A[][] in-place
// 	static void transpose(int A[][])
// 	{
// 		for (int i = 0; i < N; i++)
// 			for (int j = i + 1; j < N; j++) {
// 				int temp = A[i][j];
// 				A[i][j] = A[j][i];
// 				A[j][i] = temp;
// 			}
// 	}

// 	// Driver code
// 	public static void main(String[] args)
// 	{
// 		int A[][] = { { 1, 1, 1, 1 },
// 					{ 2, 2, 2, 2 },
// 					{ 3, 3, 3, 3 },
// 					{ 4, 4, 4, 4 } };

// 		transpose(A);

// 		System.out.print("Modified matrix is \n");
// 		for (int i = 0; i < N; i++) {
// 			for (int j = 0; j < N; j++)
// 				System.out.print(A[i][j] + " ");
// 			System.out.print("\n");
// 		}
// 	}
// }



// another method

// for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(j>=i){
//                     int temp = matrix[i][j];
//                     matrix[i][j] = matrix[j][i];    // transpose first
//                     matrix[j][i] = temp;
//                 }
//             }
//         }


