/*
 Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.

The following rules define a valid string:

Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
 

Example 1:

Input: s = "()"
Output: true


Example 2:

Input: s = "(*)"
Output: true


Example 3:

Input: s = "(*))"
Output: true


 */

package Stack;

import java.util.*;

public class validParenthesisString {
    public static boolean checkValidString(String s) {
        // Stacks to track the indices of left brackets and '*' characters
        Stack<Integer> leftBracket = new Stack<>();
        Stack<Integer> star = new Stack<>();

        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            // If the character is '(', push its index to the leftBracket stack
            if (s.charAt(i) == '(') {
                leftBracket.push(i);
            }
            // If the character is '*', push its index to the star stack
            else if (s.charAt(i) == '*') {
                star.push(i);
            }
            // If the character is ')'
            else {
                // If there is a matching '(', pop it from the leftBracket stack
                if (!leftBracket.isEmpty()) {
                    leftBracket.pop();
                }
                // If there is no '(', but there is a '*', pop it from the star stack
                else if (!star.isEmpty()) {
                    star.pop();
                }
                // If there is neither '(', nor '*', return false
                else {
                    return false;
                }
            }
        }

        // Match remaining '*' with '(' or consider them as empty.

        // If the index of the left parenthesis is not less than the index of the
        // asterisk (i.e., the left parenthesis appears after the asterisk or there's no
        // left parenthesis left to match with the asterisk), we break out of the loop
        // because no more valid matches can be found.

        while (!leftBracket.isEmpty() && !star.isEmpty()) {
            if (leftBracket.pop() > star.pop()) {
                return false;
            }
        }

        // If leftBracket stack is empty, the string is valid
        return leftBracket.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(*))";
        System.out.println(checkValidString(str));
    }
}
