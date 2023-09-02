// take you forawrd  -  https://www.youtube.com/watch?v=AZOmHuHadxQ&list=PLgUwDviBIf0pMFMWuuvDNMAkoQFi-h0ZF&index=9

// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

// Return the single element that appears only once.

// Your solution must run in O(log n) time and O(1) space.

 
// Example 1:

// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2
// Example 2:

// Input: nums = [3,3,7,7,10,11,11]
// Output: 10
 

package searching_Techniques.Binary_Search;


public class singleElementInSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            if (low == high) {
                return nums[low];
            }
            
            int mid = low + (high - low) / 2;

            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    low = mid + 1; // Move to the next even-indexed element
                } else {
                    high = mid; // The single element is on the left side
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    low = mid + 1; // Move to the next even-indexed element
                } else {
                    high = mid - 1; // The single element is on the left side
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));

    }
    
}

//     public int singleNonDuplicate(int[] nums) {
//         Set<Integer> set = new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             if(!set.add(nums[i])){
//                 set.remove(nums[i]);
//             }
//             else{
//                 set.add(nums[i]);
//             }
//         }
//         return set.iterator().next();
//     }