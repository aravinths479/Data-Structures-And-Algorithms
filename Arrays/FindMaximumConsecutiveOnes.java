// Given a binary array nums, return the maximum number of consecutive 1's in the array.

// Example 1:

// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

// Example 2:

// Input: nums = [1,0,1,1,0,1]
// Output: 2

// sliding window approach

// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int first = 0;
//         int second = 0;
//         int count = 0;
//         int max = 0;

//         while(second<nums.length){
//             if(nums[second]==1){
//                 second++;
//                 count++;
//             }
//             else{
//                 count = 0;
//                 first = second+1;
//                 second++;
//             }
//             max = Math.max(count,max); 
//         }
//         return max;
//     }
// }






public class FindMaximumConsecutiveOnes {
    public static int check(int[] nums) {
        int count=0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            if(nums[i]==0){
                count = 0;
            }
            max = Math.max(max,count);
        }

        return max;
    }
    public static void main(String args[]){
        int nums[] = {1,1,0,1,1,1};
        System.out.println( check(nums) );
    }
}
