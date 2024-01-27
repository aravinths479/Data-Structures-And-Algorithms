/*  
    
Given a 0-indexed string word and a character ch, 
reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). 
If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). 
The resulting string will be "dcbaefd".
Return the resulting string.

 

Example 1:

Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3. 
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".


Example 2:

Input: word = "xyxzxe", ch = "z"
Output: "zxyxxe"
Explanation: The first and only occurrence of "z" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".


Example 3:

Input: word = "abcd", ch = "z"
Output: "abcd"
Explanation: "z" does not exist in word.
You should not do any reverse operation, the resulting string is "abcd".

*/
package Strings;
public class reversePrefixOfTheWord {
    
    public static String reverse(String str){
        String res = "";
        for(int i=str.length()-1;i>=0;i--){
            res += str.charAt(i);
        }
        return res;
    }
    
    public static String reversePrefix(String word, char ch) {
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                String res = reverse(word.substring(0,i+1));
                return res+word.substring(i+1,word.length());
            }
        }
        return word;
    }
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word,ch));
    }
}
