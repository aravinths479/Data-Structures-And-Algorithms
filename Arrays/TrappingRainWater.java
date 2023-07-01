// https://www.youtube.com/watch?v=Ihuo_UJKrkU

// https://leetcode.com/problems/trapping-rain-water/description/

// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
// In this case, 6 units of rain water (blue section) are being trapped.

public class TrappingRainWater {
    public static int trap(int[] height) {
        int max = -1;
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        for(int i=0;i<height.length;i++){
            if(height[i]>=max){
                max = height[i];
            }
            left[i] = max;
        }
        max = -1;
        for(int i = height.length-1; i>=0;i--){
            if(height[i]>=max){
                max = height[i];
            }
            right[i] = max;
        }

        int total = 0;
        for(int i=0;i<height.length;i++){
            total = total + Math.min(left[i],right[i]) - height[i];
        }


        return total;
    }
    public static void main(String args[]){
        int nums[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(nums));
    }
}