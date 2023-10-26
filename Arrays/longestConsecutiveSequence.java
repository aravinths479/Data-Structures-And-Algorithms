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
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Create a HashSet to store the numbers in the array for quick lookup
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) { // Check if the number is the start of a sequence
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) { // Keep counting consecutive numbers
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
    public static void main(String args[]){
        int arr[] = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
}
