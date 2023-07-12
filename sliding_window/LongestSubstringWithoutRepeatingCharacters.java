// algo tamizha - https://www.youtube.com/watch?v=sQJ2KH1CWg4

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.



package sliding_window;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
       int first = 0;
       int second = 0;
       int sum = 1;
       Set<Character> set = new HashSet<>();
       while(second<s.length()){
           if(!(set.contains(s.charAt(second)))){
               set.add(s.charAt(second));
               second++;
               sum = Math.max(sum,set.size());
           }
           else{
               first++;
               set.remove(s.charAt(first));
           }
       }
       return sum;
    }
}
