// Given an array nums with n objects colored red, white, or blue, sort them in-place so that 
// objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.


// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]

import java.util.Arrays;

public class sortColors {
    public static void sortColors(int[] nums) {
        int c0 = 0;
        int c1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                c0++;
            }
            if (nums[i] == 1) {
                c1++;
            }
        }

        // refer classmate notebook for this notes
        
        for (int i = 0; i < nums.length; i++) {
            if (i < c0) {
                nums[i] = 0;
            } else if (i >= c0 && i < c0 + c1) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 2, 2, 0 };
        sortColors(arr);

    }
}