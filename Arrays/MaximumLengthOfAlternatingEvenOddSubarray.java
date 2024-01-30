// Input: a[] = {1, 2, 3, 4, 5, 7, 9} 
// Output: 5 
// Explanation: 
// The subarray {1, 2, 3, 4, 5} has alternating even and odd elements.

// https://www.youtube.com/watch?v=cvuOA2a9B9E

public class MaximumLengthOfAlternatingEvenOddSubarray {
    public static int check(int nums[]) {

        int maxLength = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((i > 0) && ((nums[i - 1] % 2 == 0 && nums[i] % 2 != 0) || (nums[i - 1] % 2 != 0 && nums[i] % 2 == 0))) {
                count++;
                maxLength = Math.max(count, maxLength);
            } else {
                count = 1;
            }
        }
        return maxLength;

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 9 };
        System.out.println(check(arr));
    }
}
