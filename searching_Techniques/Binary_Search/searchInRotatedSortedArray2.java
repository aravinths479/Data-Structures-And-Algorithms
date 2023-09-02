// take you foraward  -  https://www.youtube.com/watch?v=w2G2W8l__pc&list=PLgUwDviBIf0pMFMWuuvDNMAkoQFi-h0ZF&index=6

// There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

// Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) 
// such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
// For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

// Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

// You must decrease the overall operation steps as much as possible.

 

// Example 1:

// Input: nums = [2,5,6,0,0,1,2], target = 0
// Output: true
// Example 2:

// Input: nums = [2,5,6,0,0,1,2], target = 3
// Output: false
 


package searching_Techniques.Binary_Search;

public class searchInRotatedSortedArray2 {
    public static boolean search(int[] nums, int target) {
        int low = 0;            // Initialize the low pointer to the beginning of the array.
        int high = nums.length - 1; // Initialize the high pointer to the end of the array.

        while (low <= high) {    // While the low pointer is less than or equal to the high pointer, continue the search.

            int mid = (low + high) / 2;  // Calculate the middle index.

            if (nums[mid] == target) {  // If the middle element is equal to the target, we have found it.
                return true;           // Return true to indicate that the target is found.
            }

            // Check if there are duplicate elements at the low and mid positions
            if (nums[low] == nums[mid]) {
                low++;  // Skip duplicates on the left side by incrementing the low pointer.
            } else if (nums[low] <= nums[mid]) {
                // Left subarray is sorted
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;  // Update the high pointer to search in the left subarray.
                } else {
                    low = mid + 1;   // Update the low pointer to search in the right subarray.
                }
            } else {
                // Right subarray must be sorted
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;   // Update the low pointer to search in the right subarray.
                } else {
                    high = mid - 1;  // Update the high pointer to search in the left subarray.
                }
            }
        }

        return false;  // If the target is not found in the array, return false.
    }
    public static void main(String[] args) {
        int nums[] = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }
}
