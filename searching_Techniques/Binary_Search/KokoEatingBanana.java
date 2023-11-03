// take you forward - https://www.youtube.com/watch?v=qyfekrNni90&list=PLgUwDviBIf0pMFMWuuvDNMAkoQFi-h0ZF&index=14

// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. 

// If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

// Return the minimum integer k such that she can eat all the bananas within h hours.

 

// Example 1:

// Input: piles = [3,6,7,11], h = 8
// Output: 4

// Example 2:

// Input: piles = [30,11,23,4,20], h = 5
// Output: 30
// Example 3:

// Input: piles = [30,11,23,4,20], h = 6
// Output: 23


package searching_Techniques.Binary_Search;

public class KokoEatingBanana {
    // Helper function to find the maximum value in the array 'nums'.
    public static int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }
    
    // Helper function to calculate the total hours needed to eat all piles
    // with a given eating rate 'n'.
    public static int calc(int nums[], int n) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += Math.ceil((double) nums[i] / (double) n);
        }
        return res;
    }

    // Main function to find the minimum eating rate using binary search.
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 0;
        int high = findMax(piles);
        
        while (low <= high) {
            int mid = (low + high) / 2;
            int hrs = calc(piles, mid);

            if (hrs <= h) {
                // Koko can eat all bananas in 'h' hours with the current rate,
                // so move 'high' to explore the left half for a smaller rate.
                high = mid - 1;
            } else {
                // Koko cannot eat all bananas in 'h' hours with the current rate,
                // so move 'low' to explore the right half for a faster rate.
                low = mid + 1;
            }
        }

        return low; // The minimum eating rate found during binary search.
    }

    public static void main(String[] args) {
        int nums[] = {3, 6, 7, 11};
        int h = 8;  
        System.out.println(minEatingSpeed(nums, h));
    }
}
