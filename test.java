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

    public static void main(String[] args) {

        // System.out.println(factorial(5));
        // NToOne(8);
        // oneToN(10);
        // System.out.println(sumOfDigits(12345));
        // System.out.println(decimalToBinary(72, ""));
        // System.out.println(sumOfNnaturalNumbers(5));
        // System.out.println(pow(2, 10));
        // System.out.println(palindrome("malayalam"));

    }
}

