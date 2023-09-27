// You are a professional robber planning to rob houses along a street. 
// Each house has a certain amount of money stashed, the only constraint stopping you from robbing 
// each of them is that adjacent houses have security systems connected and it will automatically contact the 
// police if two adjacent houses were broken into on the same night.

// Given an integer array nums representing the amount of money of each house, 
// return the maximum amount of money you can rob tonight without alerting the police.

 
// Example 1:

// Input: nums = [1,2,3,1]
// Output: 4
// Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
// Total amount you can rob = 1 + 3 = 4.
// Example 2:

// Input: nums = [2,7,9,3,1]
// Output: 12
// Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
// Total amount you can rob = 2 + 9 + 1 = 12.



package Dynamic_programming.HouseRobber;

public class maximumSumInNonAdjacentArray {  // or also house rober
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            // The maximum amount we can rob at the current house is either:
            // 1. The amount robbed at the previous house (dp[i-1]).
            // 2. The current house's value plus the amount robbed two houses ago (dp[i-2]).
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        // The final element in dp[] will hold the maximum amount that can be robbed.
        return dp[nums.length - 1];
    }


    // O(1) --> space complexity
    public static int constSpaceRob(int[] nums) {
            if(nums.length==1){
                return nums[0];
            }
            if(nums.length==2){
                return Math.max(nums[0],nums[1]);
            }
        // int dp[] = new int[nums.length];

            int left = nums[0];
            int right = Math.max(nums[0],nums[1]);
            for(int i=2;i<nums.length;i++){
                int max = Math.max(right,left+nums[i]);
                left = right;
                right = max;
            }

            return right;
        }

    public static void main(String[] args) {
        
        int[] nums = {2, 7, 9, 3, 1};
        int maxRobbedAmount = rob(nums);
        System.out.println("Maximum amount that can be robbed: " + maxRobbedAmount);
    }
}


