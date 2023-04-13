import java.util.*;
public class spiral_matrix {
    public static void calc(int arr[][], int size){
        int k = 0, l = 0;  // first row and coloumn length
        int n = size;  // length of last coloumn
        int m = size;  // length of last row

        while((k<m) && (l<n)){
            for(int i=0;i<n;i++){
                System.out.print(arr[i][k]+" ");       // k - for printing on the first row
            }
            k++;
            for(int i=k;i<n;i++){                      // i = k for start printing from 2nd row
                System.out.print(arr[i][n-1]+" ");     // n-1 for reducing the coloumn size by 1 to negelect the first row
            }
            break;
        }


    }
    public static void main(String rags[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("----------------");
        System.out.println();
        calc(arr,n);

         
    }
}
