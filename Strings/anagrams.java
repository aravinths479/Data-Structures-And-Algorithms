package Strings;

import java.util.*;
public class anagrams {
    static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int arr1[] = new int[a.length()];
        int arr2[] = new int[b.length()];
        
        for(int i=0;i<a.length();i++){
            arr1[i] = a.charAt(i);
        }
        for(int i=0;i<a.length();i++){
            arr2[i] = b.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
