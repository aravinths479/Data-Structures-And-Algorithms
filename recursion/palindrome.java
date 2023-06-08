// input : kayak
// output : Yes

package recursion;

import java.util.Scanner;

public class palindrome {
    public static boolean checkPalindrome(String str) {
        if(str.length() == 0 || str.length() == 1){
            return true;
        }
        if(str.charAt(0) == str.charAt(str.length()-1)){
            return checkPalindrome(str.substring(1, str.length()-1));
        }

        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean res = checkPalindrome(str);
        if(res){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
