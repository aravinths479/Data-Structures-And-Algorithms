 // https://www.youtube.com/watch?v=khTiTSZ5QZY

// Given an integer array nums, return an array answer such that answer[i] is equal to 
// the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

import java.util.*;

public class productOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        int res[] = new int[nums.length];
        left[0] = 1;
        right[nums.length-1] = 1;

        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1]*nums[i-1];
        }
        System.out.println("Left Array : "+Arrays.toString(left));
        for(int i=nums.length-2;i>=0;i--){
            right[i] = right[i+1] * nums[i+1];
        }
        System.out.println("Right Array : "+Arrays.toString(right));
        for(int i=0;i<nums.length;i++){
            res[i] = left[i]*right[i];
        }

//  Left Array : [1, 1, 2, 6]
// Right Array : [24, 12, 4, 1]
// Result : [24, 12, 8, 6]

        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println("Result : "+Arrays.toString(productExceptSelf(nums)));
    }
}
