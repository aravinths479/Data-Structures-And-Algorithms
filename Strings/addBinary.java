// Input: a = "11", b = "1"
// Output: "100"
package Strings;
import java.math.BigInteger;

public class addBinary {
    public static String add(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return ""; // Handle empty strings as needed
        }

        BigInteger aNum = new BigInteger(a, 2);
        BigInteger bNum = new BigInteger(b, 2);
        BigInteger sum = aNum.add(bNum);

        return sum.toString(2);
    }
    public static void main(String args[]){
        String str1 = "11";
        String str2 = "1";
        String res = add(str1,str2);
        System.out.println(res);
    }
}
