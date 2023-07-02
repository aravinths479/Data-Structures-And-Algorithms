// Given an array nums of n integers where nums[i] is in the range [1, n], 
// return an array of all the integers in the range [1, n] that do not appear in nums.

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]

// Input: nums = [1,1]
// Output: [2]

import java.util.*;

public class DisappearedInAnArray{
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        List<Integer> lst = new ArrayList<Integer>();
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                lst.add(i);
            }
        }
        return lst;
    }
    public static void main(String args[]){
        int nums[] = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}