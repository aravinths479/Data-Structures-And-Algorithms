// m a l a y a l a m

package simple_programs;

import java.util.*;
public class palindrome {

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() -1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();


        if(isPalindrome(str)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }






    //     int left = 0;
    //     int right = str.length()-1;

    //     boolean res = true;
    //   // m a l a y a l a m
    //     while(left<=right){
    //         if(str.charAt(left)!=(str.charAt(right))){
    //             res = false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     if(res){
    //         System.out.println("palindrome");
    //     }
    //     else{
    //         System.out.println("Not Palindrome");
    //     }
    }
}
