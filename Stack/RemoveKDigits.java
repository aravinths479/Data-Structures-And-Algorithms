// nick white  --  https://www.youtube.com/watch?v=vbM41Zql228

/*
 
Given string num representing a non-negative integer num, and an integer k, 
return the smallest possible integer after removing k digits from num.

 

Example 1:

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.


Example 2:

Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.


Example 3:

Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.

 */

package Stack;

import java.util.Stack;

public class RemoveKDigits {
    public static String removeKdigits(String num, int k) {
        // If the length of num is equal to k, removing all digits results in "0"
        if (num.length() == k) {
            return "0";
        }

        // Stack to store digits in ascending order
        Stack<Character> st = new Stack<>();

        // Iterate through each character in the input num
        for (char ch : num.toCharArray()) {
            // While there are more removals to be made, the stack is not empty,
            // and the current character is smaller than the top of the stack
            while (k > 0 && !st.isEmpty() && st.peek() > ch) {
                // Remove the top of the stack
                st.pop();
                k--;
            }
            // Push the current character onto the stack
            st.push(ch);
        }

        // After processing all characters, if there are still removals to be made
        while (k > 0) {
            // Remove digits from the top of the stack
            st.pop();
            k--;
        }

        // Build the result string using the remaining digits on the stack
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        // Reverse the result string
        sb.reverse();

        // Remove leading zeros, except if the result is "0"
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // Convert StringBuilder to String and return the result
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeKdigits("1432219", 3));
    }
}
