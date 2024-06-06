package Strings;

import java.util.*;

public class patternIndexFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String word = sc.next();
        sc.close();
        
        int offset = 0;
        
        while (text.indexOf(word) != -1) {
            int index = text.indexOf(word);
            System.out.println("Pattern found at index " + (offset + index));
            
            // Update the text to move past the found word
            text = text.substring(index + word.length());
            offset += index + word.length();
        }
    }
}
