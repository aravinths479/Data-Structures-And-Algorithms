/*

Exaplined in byts note string


Given a string str of lowercase alphabets. The task is to find the maximum occurring character in the string str. 
If more than one character occurs the maximum number of time then print the lexicographically smaller character.

Example 1:

Input:  str = testsample
Output: e

Explanation: e is the character which
is having the highest frequency.


Example 2:

Input:  str = output
Output: t

Explanation:  t and u are the characters
with the same frequency, but t is
lexicographically smaller.

 */
package Strings;

public class maximumOccuringChar {
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int[] count = new int[26];

        // Store the frequencies of characters.
        for (int i = 0; i < line.length(); i++) {
            // Internal typecasting happening from CHAR to INT
            count[line.charAt(i) - 97]++;
        }
        // Find the maximum of frequencies.
        int max = 0;
        int maxIndex = -1;
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i]; // Corrected this line
                maxIndex = i;
            }
        }

        // External typecasting needs to be done from an integer to char.
        return (char)(maxIndex + 97);
    }
    public static void main(String[] args) {
        String str = "testsample";
        System.out.println(getMaxOccuringChar(str));
    }
}
