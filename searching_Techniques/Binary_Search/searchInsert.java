// Given a sorted array of distinct integers and a target value, return the index if the target is found. 
// If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4

package searching_Techniques.Binary_Search;

public class searchInsert {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;

        // explanation : 
        // [1,3,5,6] , t=2 , left = 0, right = 3
        
        // mid = (0+3)/2 = 1  , left = 0 , right = 0
        // mid = (0+0)/2 = 0  , left = 1 , right = 0
        // now return left

        System.out.println(searchInsert(nums,target));
    }
}
