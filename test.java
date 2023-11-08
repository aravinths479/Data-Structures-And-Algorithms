import java.util.*;


public class test {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void NToOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        NToOne(n - 1);
    }

    public static void oneToN(int n) {
        if (n == 0) {
            return;
        }
        oneToN(n - 1);
        System.out.print(n+" ");
    }

    public static int sumOfDigits(int digit) {
        if (digit == 0) {
            return digit;
        }
        return digit%10 + sumOfDigits(digit/10);
    }

    public static String decimalToBinary(int num, String res) {
        if (num == 0) {
            return res;
        }
        res = num % 2 + res;

        return decimalToBinary(num / 2, res);
    }

    public static int sumOfNnaturalNumbers(int n){
        if(n==0){
            return n;
        }
        return n + sumOfNnaturalNumbers(n-1);
    }

    public static int pow(int x, int n){
        if(n==1){
            return x;
        }
        return x * pow(x, n-1);
    }

    public static boolean palindrome(String str){
        if(str.length() == 1 ||  str.length() == 0 ){
            return true;
        }
        if(str.charAt(0)==str.charAt(str.length()-1)){
            return palindrome(str.substring(1,str.length()-1));
        }
        return false;
    }
    public static boolean palindromeTwoPointer(String str){
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public static boolean isHappy(int n) {
        String str = ""+n;
        while(Integer.parseInt(str)>=0){
            char[] nums = str.toCharArray();
            int sum = 0;
            for(int i:nums){
                int ch = i-'0';
                sum += ch*ch;
            }
            if(sum == 1){
                return true;
            }
            if(sum<1){
                return false;
            }
            str = ""+sum;
        }

        return false;
    }

    public static void main(String[] args) {

        // System.out.println(factorial(5));
        // NToOne(8);
        // oneToN(10);
        // System.out.println(sumOfDigits(12345));
        // System.out.println(decimalToBinary(72, ""));
        // System.out.println(sumOfNnaturalNumbers(5));
        // System.out.println(pow(2, 10));
        // System.out.println(palindrome("malayalam"));
        // System.out.println(palindromeTwoPointer("malayalam"));
        
        System.out.println(isHappy(2));


    }
}

