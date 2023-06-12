// Write a program to sort an array of integers in ascending order.
// Input: [5, 2, 8, 3, 1]
// Output: [1, 2, 3, 5, 8]

package simple_programs;
import java.util.*;
public class sortArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
