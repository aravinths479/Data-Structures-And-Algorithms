// input : aabbbcccccfffffff
// output : a2b3c5f7


// sliding window technique

package Strings;

import java.util.*;
public class abbccc {
    public static void main(String args[]){
        String str = "aabbbcccccfffffff";
        String res = "";
        int first = 0;
        int second = 0;
        int count = 0;
        while(second<str.length()){
            if(str.charAt(first)==str.charAt(second)){
                count++;
                second++;
            }
            else{
                res = res+ str.charAt(first) + count;
                first = second;
                count = 0;
            }
        }
         res = res+ str.charAt(first) + count;
        System.out.println(res);
    }
}



// import java.util.HashMap;
// import java.util.Map;

// public class CharacterFrequency {
//     public static String getCharacterFrequency(String input) {
//         // Create a HashMap to store character frequencies
//         Map<Character, Integer> frequencyMap = new HashMap<>();

//         // Iterate through each character in the input string
//         for (char c : input.toCharArray()) {
//             // Check if the character already exists in the HashMap
//             if (frequencyMap.containsKey(c)) {
//                 // Increment the frequency by 1
//                 frequencyMap.put(c, frequencyMap.get(c) + 1);
//             } else {
//                 // Add the character to the HashMap with a frequency of 1
//                 frequencyMap.put(c, 1);
//             }
//         }

//         // Build the final output string
//         StringBuilder output = new StringBuilder();
//         for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
//             output.append(entry.getKey());
//             output.append(entry.getValue());
//         }

//         return output.toString();
//     }

//     public static void main(String[] args) {
//         String input = "aabbccddd";
//         String output = getCharacterFrequency(input);
//         System.out.println(output); // Output: a2b2c2d3
//     }
// }
