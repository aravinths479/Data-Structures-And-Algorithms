/*
 
An array arr is a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, 
return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.

 

Example 1:

Input: arr = [0,1,0]
Output: 1

Example 2:

Input: arr = [0,2,1,0]
Output: 1

Example 3:

Input: arr = [0,10,5,2]
Output: 1

 */


public class peakIndexInMOuntainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int low = 1;
        int high = arr.length-2;
        
        while(low<=high){
            int mid = low+(high - low)/2;
            if(arr[mid] > arr[mid+1]  && arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
