//  take you forward  - https://www.youtube.com/watch?v=5qGrJbHhqFs&list=PLgUwDviBIf0pMFMWuuvDNMAkoQFi-h0ZF&index=5


// There is an integer array nums sorted in ascending order (with distinct values).

// Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4


// Example 2:

// Input: nums = [4,5,6,7,0,1,2], target = 3
// Output: -1


// Example 3:

// Input: nums = [1], target = 0
// Output: -1


package searching_Techniques.Binary_Search;

public class searchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
    
        while(low <= high) {
            int mid = (low + high) / 2;
    
            if(nums[mid] == target) {
                return mid;  // If the middle element is the target, return its index.
            }
    
            if(nums[low] <= nums[mid]) {
                // If the left half is sorted (no rotation)
                if(nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;  // Adjust the 'high' pointer to search in the left half.
                } else {
                    low = mid + 1;  // Adjust the 'low' pointer to search in the right half.
                }
            } else {
                // If the right half is sorted (no rotation)
                if(nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;  // Adjust the 'low' pointer to search in the right half.
                } else {
                    high = mid - 1;  // Adjust the 'high' pointer to search in the left half.
                }
            }
        }
        return -1;  // If the target element is not found, return -1.
    }
    
        public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
        
    }
}
