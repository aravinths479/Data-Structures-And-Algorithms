/*
 
You are given a string s consisting of lowercase English letters. 
A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

 

Example 1:

Input: s = "abbaca"
Output: "ca"

Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, 
and this is the only possible move.  The result of this move is that the string is "aaca", 
of which only "aa" is possible, so the final string is "ca".


Example 2:

Input: s = "azxxzy"
Output: "ay"

 */

package Stack;

import java.util.*;

public class removeAllAdjacentDuplicatesInString {
    public static String removeDuplicates(String s) {
        // Create a stack to keep track of characters
        Stack<Character> st = new Stack<>();

        // Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            // Check if the stack is not empty and the current character matches the top of the stack
            if (!st.isEmpty() && st.peek() == s.charAt(i)) {
                // Remove the top element from the stack, as it forms a pair with the current character
                st.pop();
                continue; // Skip the rest of the loop and move to the next iteration
            }

            // If the stack is empty or the current character is different, push it onto the stack
            st.push(s.charAt(i));
        }

        // Build the result string from the remaining characters in the stack
        String res = "";
        for (char ch : st) {
            res += ch;
        }

        // Return the final result after removing adjacent duplicates
        return res;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
        System.out.println(removeDuplicates("azxxzy"));
    }
}
