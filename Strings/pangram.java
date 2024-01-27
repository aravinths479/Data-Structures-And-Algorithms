// A pangram is a sentence where every letter of the English alphabet appears at least once.

// Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, 
// or false otherwise.

 

// Example 1:

// Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
// Output: true
// Explanation: sentence contains at least one of every letter of the English alphabet.


// Example 2:

// Input: sentence = "leetcode"
// Output: false
package Strings;
import java.util.*;

public class pangram {
    public static boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        sentence = sentence.toLowerCase();
        for(int i=0;i<sentence.length();i++){
            set.add(sentence.charAt(i));
        }
        if(set.size()==26){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsovrthelazydog";
        System.out.println(checkIfPangram(str));
    }
}