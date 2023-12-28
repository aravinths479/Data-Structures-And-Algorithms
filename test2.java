import java.util.Arrays;
import java.util.Stack;

class Solution {

    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public static String reverseStr(String s, int k) {

        String res = "";
        int i = 0;
        int rev = 0;
        while (i <= s.length() - k) {
            if (rev != k) {
                res += reverse(s.substring(i, i + k));
                i = i + k;
            }
            if (rev == k) {
                res += s.charAt(i);
                i += 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "abcd";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }
}
