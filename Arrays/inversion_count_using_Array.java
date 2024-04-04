// Input: arr[] = {8, 4, 2, 1}
// Output: 6
// Explanation: Given array has six inversions: (8, 4), (8, 2), (8, 1), (4, 1),(4, 2), (2, 1).

import java.util.*;
public class inversion_count_using_Array {
    public static void inversion_count(int arr[], int n){
        int count =0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }   
        System.out.println(count);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        inversion_count(arr,n);
        sc.close();
    }
}
