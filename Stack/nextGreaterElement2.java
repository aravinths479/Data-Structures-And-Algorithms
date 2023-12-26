//  nick white - https://www.youtube.com/watch?v=ARkl69eBzhY



/*
 
Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), 
return the next greater number for every element in nums.

The next greater number of a number x is the first greater number to its traversing-order next in the array, 
which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.

 

Example 1:

Input: nums = [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number. 
The second 1's next greater number needs to search circularly, which is also 2.


Example 2:

Input: nums = [1,2,3,4,3]
Output: [2,3,4,-1,4]

 */


package Stack;
import java.util.*;

class nextGreaterElement2 {
    public static int[] nextGreaterElements(int[] nums) {
        // Stack to keep track of indices
        Stack<Integer> st = new Stack<>();

        // Result array initialized with -1
        int res[] = new int[nums.length];
        Arrays.fill(res, -1);

        // Iterate through the circular array (twice the length of nums)
        for (int i = 0; i < 2 * nums.length; i++) {
            // While stack is not empty and the current element is greater than the element
            // at the top of the stack
            while (!st.isEmpty() && nums[st.peek()] < nums[i % nums.length]) {
                // Update result for the index at the top of the stack
                res[st.pop()] = nums[i % nums.length];
            }

            // Push the current index onto the stack (only for the first pass)
            if (i < nums.length) {
                st.push(i);
            }
        }

        // Result array contains the next greater element for each element in nums, or
        // -1 if not found
        return res;
    }

    public static void main(String[] args) {

        // Test case 1
        int[] nums1 = {1, 2, 1};
        int[] result1 = nextGreaterElements(nums1);
        System.out.println("Test Case 1: " + Arrays.toString(result1));

        // Test case 2
        int[] nums2 = {5, 4, 3, 2, 1};
        int[] result2 = nextGreaterElements(nums2);
        System.out.println("Test Case 2: " + Arrays.toString(result2));
    }
}
