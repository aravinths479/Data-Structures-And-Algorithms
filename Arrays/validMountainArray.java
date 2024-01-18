/*

Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

 

Example 1:

Input: arr = [2,1]
Output: false


Example 2:

Input: arr = [3,5,5]
Output: false

Example 3:

Input: arr = [0,3,2,1]
Output: true

 */

public class validMountainArray {
    public static boolean validMountainArray(int[] arr) {
        if(arr.length==1 || arr.length==2){
            return false;
        }

        int left = 0;
        int right = arr.length-1;

        for(int i=0;i<arr.length-1;i++){
            if(arr[left] < arr[left + 1]){
                left++;
            }
        }
        for(int i=arr.length-1;i>0;i--){
            if(arr[right - 1] > arr[right]){
                right--;
            }
        }
        return left > 0 && right < arr.length - 1 && left == right;
    }
    public static void main(String[] args) {
        int arr[] = {0,3,2,1};
        System.out.println(validMountainArray(arr));
    }
}
