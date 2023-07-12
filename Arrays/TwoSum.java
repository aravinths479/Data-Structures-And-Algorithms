// https://www.youtube.com/watch?v=7GF0xKXdZE4  - algo tamizha



// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1]

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    

// this approach cannot be done because it sums  the same element twice in 2nd test case

//     public static int[] twoSum(int[] nums, int target) {
//         Map<Integer,Integer> map = new HashMap<>();
        
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i],i);
//         }
//         for(int i=0;i<nums.length;i++){
//             if(map.containsKey(target-nums[i])){
//                 return new int[]{i,map.get(target-nums[i])};  
//             }
//         }
//     return null;
//     }

    public static void main(String args[]){
        int arr[] = {2,7,11,15};
        int target = 9;
        int res[] = twoSum(arr,target);
        for(int i:res){
            System.out.print("["+i+"]");
        }
    }
}
