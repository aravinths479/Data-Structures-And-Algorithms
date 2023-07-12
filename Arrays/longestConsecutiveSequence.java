// https://www.youtube.com/watch?v=FhTBdxB0OuY    - algo tamizha

// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.


// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int max = 0;

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]-1)){
                continue;
            }

            int length = 0;
            while(set.contains(nums[i])){
                nums[i] = nums[i]+1;
                length = length+1;
            }
            max = Math.max(max,length);
            
        }


        return max;
    }
    public static void main(String args[]){
        int arr[] = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
}
