// Write a program to check if two strings are anagrams.
// Input: "listen", "silent"
// Output: Anagrams




//  listen , silent





package simple_programs;

import java.util.*;
public class anagrams {


    public static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        
        char arr1[] = new char[str1.length()];
        char arr2[] = new char[str1.length()];

        for(int i=0;i<str1.length();i++){
            arr1[i] = str1.charAt(i);
            arr2[i] = str2.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    
    }


    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        boolean res = true;

        boolean result = isAnagram(str1, str2);
        System.out.println(result);


        // if(str1.length()!=str2.length()){
        //     res = false;
        // }
        // else{

        //     int arr1[] = new int[str1.length()];
        //     int arr2[] = new int[str2.length()];

        //     for(int i=0;i<str1.length();i++){
        //         arr1[i] = str1.charAt(i) - '0';
        //         arr2[i] = str2.charAt(i) - '0';
        //     }

        //     Arrays.sort(arr1);
        //     Arrays.sort(arr2);

        //     for(int i=0;i<arr1.length;i++){
        //         if(arr1[i]!=arr2[i]){
        //             res = false;
        //             break;
        //         }
        //     }
        // }
        // if(res){
        //     System.out.println("Anagrams");
        // }
        // else{
        //     System.out.println("Not anagrams");
        // }
        
    }
}
