
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:

// Input: s = "()"
// Output: true

// Example 2:

// Input: s = "()[]{}"
// Output: true

// Example 3:

// Input: s = "(]"
// Output: true

package Stack;
import java.util.*;

public class validParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                if(st.empty()){
                    return false;
                }
                char top = st.pop();
                if(top =='{' && s.charAt(i)=='}'){
                    continue;
                }
                else if(top == '[' && s.charAt(i)==']'){
                    continue;
                }
                else if(top == '(' && s.charAt(i)==')'){
                    continue;
                }
                else{
                    return false;
                }
                
            }
        }

        return st.empty();
    }
    public static void main(String[] args) {
        String str = "{}[]()";
        System.out.println(isValid(str));
    }
}