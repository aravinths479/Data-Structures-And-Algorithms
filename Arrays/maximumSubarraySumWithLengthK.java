// https://www.youtube.com/watch?v=jhW7VwP2Djw

// Input: nums = [2,9,31,-4,21,7], k = 3
// Output: 48

//the maximum subarray sum of all the subarrays that meet the conditions
// Explanation: The subarrays of nums with length 3 are:
// [2,9,31], which meets the requirements and has a sum of 42.
// [9,31,-4], which meets the requirements and has a sum of 36.
// [31,-4,21], which meets the requirements and has a sum of 48.
// [-4,21,7], which meets the requirements and has a sum of 24.
// We return 48 because it is 


// sliding window technique
public class maximumSubarraySumWithLengthK {
    public static int check(int nums[], int k){
        
        int wsum = 0;
        int msum = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            wsum = wsum + nums[i];
        }
        msum = wsum;
        for(int i=k;i<nums.length;i++){
            wsum = wsum - nums[i-k] + nums[i];
            msum = Math.max(wsum,msum);
        }
        return msum;
    }
    public static void main(String args[]){
        int nums[] = {2,9,31,-4,21,7};
        int k = 3;
        System.out.println(check(nums,k));
    }   
}


