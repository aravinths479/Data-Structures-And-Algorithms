/*
 
Given a string s, return true if the s can be palindrome after deleting at most one character from it.

 

Example 1:

Input: s = "aba"
Output: true


Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.


Example 3:

Input: s = "abc"
Output: false

 */

public class palindrome2 {
    public static boolean check(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return check(s,left+1,right) || check(s,left,right-1);
            }
            left++;
            right--;
        }
            return true;
    }
    public static void main(String[] args) {
        String str = "abca";
        System.out.println(validPalindrome(str));
    }
}
