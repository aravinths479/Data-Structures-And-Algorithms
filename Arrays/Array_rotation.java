// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]

// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]

// Trick :

// initial arr : [1,2,3,4,5,6,7]
// reverse all : [7,6,5,4,3,2,1]
// reverse first k nums : [5,6,7, 4,3,2,1]
// reverse remaining nums : [5,6,7, 1,2,3,4]  - result


import java.util.*;
public class Array_rotation{
    public static int[] reverse(int arr[],int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        return arr;
    }

    public static void calc(int arr[] , int k){
        arr = reverse(arr,0,arr.length-1);
        arr = reverse(arr, 0, k-1);
        arr = reverse(arr,k,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        calc(arr,k);
    }
}
