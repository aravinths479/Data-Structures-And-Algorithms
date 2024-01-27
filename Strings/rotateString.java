/* 

Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true


Example 2:

Input: s = "abcde", goal = "abced"
Output: false

*/
package Strings;

public class rotateString {
    public static boolean rotate(String s, String goal) {
        String res = "";
        for(int i=0;i<s.length();i++){
            res = s.substring(i+1,s.length()) + s.substring(0,i+1);
            if(res.equals(goal)){
                return true;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotate(s, goal));
    }
}
