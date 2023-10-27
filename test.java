import java.util.*;
public class test {
    public static int findMax(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i],max);
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = {3,6,7,11};
        int hr = 8;
        int max = findMax(nums);
        
     
    }
}