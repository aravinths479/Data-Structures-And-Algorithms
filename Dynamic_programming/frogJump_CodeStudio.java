// https://www.youtube.com/watch?v=EgG3jsGoPvQ&list=PLgUwDviBIf0qUlt5H_kiKYaNSqJ81PMMY&index=4
// code studio problem


package Dynamic_programming;
public class frogJump_CodeStudio{
    public static int frogJump(int heights[]) {

        int prev = 0;  // Energy required for the (i-1)th stair
        int prev2 = 0; // Energy required for the (i-2)th stair
        for(int i = 1; i < heights.length; i++){
            
            int jumpTwo = Integer.MAX_VALUE; // Energy required to jump two stairs. to also handle last step edge test case
            
            // Energy required to jump one stair
            int jumpOne = prev + Math.abs(heights[i] - heights[i - 1]);
            
            // Calculate energy required to jump two stairs if i is greater than 1
            if(i > 1)
                jumpTwo = prev2 + Math.abs(heights[i] - heights[i - 2]);
        
            int cur_i = Math.min(jumpOne, jumpTwo); // Minimum energy required to reach the current stair
            
            // Update previous energy values for the next iteration
            prev2 = prev;
            prev = cur_i;
            
        }
        
        return prev; // also can return current energy at last
    }
   public static void main(String[] args) {
       int[] HEIGHT = {10, 20, 30, 10};
       int minEnergy = frogJump(HEIGHT);
       System.out.println("Minimum total energy used by the frog: " + minEnergy);
    }
}