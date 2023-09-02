// https://www.youtube.com/watch?v=cXxmbemS6XM&list=PLgUwDviBIf0pMFMWuuvDNMAkoQFi-h0ZF&index=10

// A peak element is an element that is strictly greater than its neighbors.

// Given a 0-indexed integer array nums, find a peak element, and return its index. 

// If the array contains multiple peaks, 
// "" return the index to any of the peaks "".

// You may imagine that nums[-1] = nums[n] = -∞. 
// In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

// You must write an algorithm that runs in O(log n) time.

 
// Example 1:

// Input: nums = [1,2,3,1]
// Output: 2
// Explanation: 3 is a peak element and your function should return the index number 2.
// Example 2:

// Input: nums = [1,2,1,3,5,6,4]
// Output: 5
// Explanation: Your function can return either index number 1 where the peak element is 2,
//              or index number 5 where the peak element is 6.


package searching_Techniques.Binary_Search;

public class peakElement {
    public static int findPeakElement(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        if(nums[0]>nums[1]){
            return 0;
        }

        int left = 1;
        int right = nums.length-2;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            else if(nums[mid]<nums[mid+1]){
                left = mid+1;
            }
            else{
                right = mid-1;    
            }
        }

        
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {5, 10, 7, 15, 12, 3, 20, 6, 8, 11};
        System.out.println(findPeakElement(nums));
    }
}
