// take you forward  -  youtube.com/watch?v=RIn3gOkbhQE&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=14

// Given an integer array nums that may contain duplicates, return all possible 
// subsets
//  (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

 

// Example 1:

// Input: nums = [1,2,2]
// Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
// Example 2:

// Input: nums = [0]
// Output: [[],[0]]



package recursion2;
import java.util.*;
public class subset2 {

    public static void print(int index, List<Integer> lst, List<List<Integer>> ans, int[] nums) {
        // Add the current subset to the result
        ans.add(new ArrayList<>(lst));
        
        // Iterate through the elements in the input array
        for (int i = index; i < nums.length; i++) {
            // Check for duplicates: if the current element is equal to the previous element,
            // and it's not the first occurrence of the element, skip it to avoid duplicate subsets
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Include the current element in the subset
            lst.add(nums[i]);
            
            // Recursively generate subsets starting from the next index
            print(i + 1, lst, ans, nums);
            
            // Backtrack by removing the last element to explore other possibilities
            lst.remove(lst.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        // Sort the input array to group duplicates together
        Arrays.sort(nums);
        
        // Start the recursion with initial values
        print(0, new ArrayList<>(), ans, nums);
        
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
}
