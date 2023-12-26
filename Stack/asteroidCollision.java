/*
 
We are given an array asteroids of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, 
and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. 
If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. 
Two asteroids moving in the same direction will never meet.

 

Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.


Example 2:

Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.


Example 3:

Input: asteroids = [10,2,-5]
Output: [10]
Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.

 */


package Stack;

import java.util.*;

public class asteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        // Iterate through each asteroid
        for(int ast : asteroids) {
            // If the asteroid is moving to the right, push it to the stack
            if(ast > 0) {
                st.push(ast);
            } else {
                // Handle collisions with asteroids moving to the left
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(ast)) {
                    st.pop(); // Destroy the asteroid moving to the right
                }

                // Check conditions for surviving asteroid or no collision
                if(st.isEmpty() || st.peek() < 0) {
                    st.push(ast); // No collision or surviving asteroid moving to the left
                }

                // Check if the current asteroid annihilates with the top of the stack
                if(st.peek() == Math.abs(ast)) {
                    st.pop(); // Both asteroids annihilate each other
                }
            }
        }

        // Convert the remaining asteroids in the stack to an array
        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
    public static void main(String[] args) {
        int arr[] = { 5, -2, 8, -6, 3, -10 };
        System.out.println(Arrays.toString(asteroidCollision(arr)));  // [-10]
    }
}
