/*
 
Given an array of integers temperatures represents the daily temperatures, 
return an array answer such that answer[i] is the number of days you have to wait 
after the ith day to get a warmer temperature. If there is no future day for which this is possible, 
keep answer[i] == 0 instead.

 

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]
 

 */

package Stack;

import java.util.Arrays;
import java.util.Stack;

public class dailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        // Stack to store indices of temperatures
        Stack<Integer> st = new Stack<>();

        // Array to store the result (number of days until a warmer temperature)
        int res[] = new int[temperatures.length];

        // Iterate through the temperatures array
        for (int i = 0; i < temperatures.length; i++) {
            // Check if the stack is not empty and the current temperature is higher than
            // the temperature at the index on top of the stack
            while (!st.empty() && temperatures[i] > temperatures[st.peek()]) {
                // If true, pop the index from the stack and update the result at that index
                int prevIndex = st.pop();
                res[prevIndex] = Math.abs(i - prevIndex);
            }
            
            // Push the current index onto the stack
            st.push(i);
        }

        // Return the array containing the number of days until a warmer temperature for
        // each day
        return res;
    }

    public static void main(String[] args) {
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] result = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result));
    }
}
