// 12, 23, 34, 45, 56, 67, 78, 89, 90, 678
// Target Element : 56
// position at : 4


package recursion;

import java.util.Scanner;

public class binarySearch {
    public static int search_element(int[] arr,int target,int left,int right) {
        if(left <= right){
            int mid = (left + right)/2;
            if(arr[mid]== target){
                return mid;
            }
            if(target<arr[mid]){
                return search_element(arr, target,left, mid);
            }
            if(target>arr[mid]){
                return search_element(arr, target,mid+1, right);
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Target Element : ");
        int target = sc.nextInt();
        int index = search_element(arr, target,0,arr.length-1);
        System.out.println("position at : "+index);

    }
}
