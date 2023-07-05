//  algo tamizha -   https://www.youtube.com/watch?v=Hbl60aeDpYk
// watch for explanation

// You are given an integer array height of length n. There are n vertical lines drawn 
// such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.


// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
// In this case, the max area of water (blue section) the container can contain is 49.


package Two_Pointers_Technique;

public class containerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int area = 0;
        int res = -1;
        while(left<right){
            int min = Math.min(height[left],height[right]);
            area = min * (right-left);
            res = Math.max(res,area);

            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }

        }
        return res;
    }
    public static void main(String args[]){
        int height[] = {1,8,6,2,5,4,8,3,7};
        int res = maxArea(height);
        System.out.println(res);
    }
}
