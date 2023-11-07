

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