/*
 
Given two strings ransomNote and magazine, return true if ransomNote can be constructed 
by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false


Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false


Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true

 */


import java.util.HashMap;

public class ransomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer>  map = new HashMap<>();

        for(char ch:magazine.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(char r: ransomNote.toCharArray()){
            if(!map.containsKey(r)){
                return false;
            }
            else{
                if(map.get(r)==0){
                    return false;
                }
                map.put(r,map.get(r)-1);
            }
        }

        System.out.println(map);

        return true;
        
    }
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
