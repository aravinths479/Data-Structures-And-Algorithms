/*
 
You are given two strings s and t.

String t is generated by random shuffling string s and then add one more letter at a random position.

Return the letter that was added to t.

 

Example 1:

Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.


Example 2:

Input: s = "", t = "y"
Output: "y"


 */

import java.util.ArrayList;

public class findTheDifference {
    public static char findTheDifference(String s, String t) {
        ArrayList<Character> lst = new ArrayList<>();
        for(char i:s.toCharArray()){
            lst.add(i);
        }
        
        for(char ch:t.toCharArray()){
            if(!lst.contains(ch)){
                return ch;
            }
            else{
                lst.remove(Character.valueOf(ch));
            }
        }

        return '0';
    }
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
}
