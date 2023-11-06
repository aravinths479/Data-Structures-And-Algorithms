/* 

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. 
No two characters may map to the same character, but a character may map to itself.

 
Example 1:

Input: s = "egg", t = "add"
Output: true

Example 2:

Input: s = "foo", t = "bar"
Output: false

TExample 3:

Input: s = "paper", t = "title"
Output: true

 */


import java.util.*;

public class isomorphicStrings {
    public static boolean isIsomorphicString(String s1 ,String s2){
        if(s1.length()!=s1.length()){
            return false;
        }

        Map<Character,Character> map= new HashMap<>();

        for(int i=0;i<s1.length();i++){

            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if(!map.containsKey(ch1)){
                if(!map.containsValue(ch2)){
                    map.put(ch1,ch2);
                }
                else{
                    return false;
                }
            }
            else{
                if(map.get(ch1)!=ch2){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]) {
        String s1 = "egg";
        String s2 = "abb";
        System.out.println(isIsomorphicString(s1, s2));

    }
}
