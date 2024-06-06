import java.util.*;

public class matrix_multiply {
    static int[][] multiply(int arr1[][], int arr2[][], int n){
        
        int res[][] = new int[n][n];
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    sum = sum+(arr1[i][k]*arr2[k][j]);
                }
                res[i][j] = sum;
                sum = 0;
            }
            
        }   
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[][] = new int[n][n];
        int arr2[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int res[][] = multiply(arr1, arr2,n);
        for(int[] i:res){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
