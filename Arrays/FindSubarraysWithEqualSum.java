// Given a 0-indexed integer array nums, determine whether there exist two subarrays of length 2 with equal sum. 
// Note that the two subarrays must begin at different indices.

// Return true if these subarrays exist, and false otherwise.

// A subarray is a contiguous non-empty sequence of elements within an array.


// Example 1:

// Input: nums = [4,2,4]
// Output: true
// Explanation: The subarrays with elements [4,2] and [2,4] have the same sum of 6.


// Example 2:

// Input: nums = [1,2,3,4,5]
// Output: false
// Explanation: No two subarrays of size 2 have the same sum.

// Example 3:

// Input: nums = [0,0,0]
// Output: true
// Explanation: The subarrays [nums[0],nums[1]] and [nums[1],nums[2]] have the same sum of 0. 
// Note that even though the subarrays have the same content, the two subarrays are considered different because they are in different positions in the original array.

import java.util.*;

public class FindSubarraysWithEqualSum {
    public static boolean findSubarrays(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int first_sub = nums[0] + nums[1];
        int second_sub = nums[1] + nums[2];

        if(first_sub == second_sub){
                return true;
            }

        
        for(int i=3;i<nums.length;i++){
            first_sub = nums[i-2] + nums[i-1];
            for(int j=i;j<nums.length;j++){
                second_sub = nums[j-1] + nums[j];
                if(first_sub == second_sub){
                return true;
            }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5};
        System.out.println(findSubarrays(nums));
    }
}

class Solution {
    public boolean findSubarrays(int[] nums) {
        if(nums.length<3){
            return false;
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length-1;i++){
            if(set.contains(nums[i]+nums[i+1])){
                return true;
            }
            else{
                set.add(nums[i]+nums[i+1]);
            }
        }


        return false;
    }
}