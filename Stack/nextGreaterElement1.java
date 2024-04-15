/*
 
The next greater element of some element x in an array is the first greater element that is to the right of x in 
the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the 
next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

 

Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]

Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.


Example 2:

Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]

Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.

 */

package Stack;

import java.util.*;

public class nextGreaterElement1 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Initialize a stack to keep track of elements in nums2
        Stack<Integer> stack = new Stack<>();
        // Create a HashMap to store the next greater element for each element in nums2
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse nums2 array
        for (int i : nums2) {
            // While the stack is not empty and the current element is greater than the top
            // of the stack
            while (!stack.empty() && stack.peek() < i) {
                // Map the top of the stack to the current element, as it is the next greater
                // element
                map.put(stack.pop(), i);
            }
            // Push the current element onto the stack
            stack.push(i);
        }

        // Create an array to store the results for nums1
        int res[] = new int[nums1.length];

        // Traverse nums1 array
        for (int i = 0; i < nums1.length; i++) {
            // Set the result for each element in nums1 using the map, defaulting to -1 if
            // not found
            res[i] = map.getOrDefault(nums1[i], -1);
        }

        // Return the array with next greater elements for each element in nums1
        return res;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };
        int[] result1 = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(result1));

        // Test Case 2
        int[] nums3 = { 2, 4 };
        int[] nums4 = { 1, 2, 3, 4 };
        int[] result2 = nextGreaterElement(nums3, nums4);
        System.out.println(Arrays.toString(result2));
    }
}
