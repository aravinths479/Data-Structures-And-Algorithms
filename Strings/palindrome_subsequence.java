// Given a string s, return the longest palindromic substring in s.


// Example 1:

// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer.
// Example 2:

// Input: s = "cbbd"
// Output: "bb"

package Strings;

public class palindrome_subsequence {
    public static String palindrome(String str, int ind) {
        
        int right = ind;
        int left = ind;
        while (right < str.length() && left >= 0 && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        String oddPalindrome = str.substring(left + 1, right);

        
        right = ind + 1;
        left = ind;
        while (right < str.length() && left >= 0 && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        String evenPalindrome = str.substring(left + 1, right);

     
        return (oddPalindrome.length() > evenPalindrome.length()) ? oddPalindrome : evenPalindrome;
    }
    public static void main(String[] args) {
  
        String str = "babad";
        

        String longestPalindrome = "";
        for (int i = 0; i < str.length(); i++) {
            String currentPalindrome = palindrome(str, i);
            if (currentPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = currentPalindrome;
            }
        }
        System.out.println("Longest Palindromic Subsequence: " + longestPalindrome);
    }
    }




 //  arara

    //  adbvararajhdjvararavjdj


    // 7