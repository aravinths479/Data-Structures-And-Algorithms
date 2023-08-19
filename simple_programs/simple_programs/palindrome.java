package simple_programs;

import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int left = 0;
        int right = str.length()-1;
        boolean res = true;
        while(left<=right){
            if(str.charAt(left)!=(str.charAt(right))){
                res = false;
            }
            left++;
            right--;
        }
        if(res){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
