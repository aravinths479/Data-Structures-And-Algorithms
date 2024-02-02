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

        /*
         * 
         * When we refer to "arbitrary size" in the context of BigInteger in Java, we
         * mean that BigInteger can represent integers of virtually any size, limited
         * only by the available memory of the system.
         * 
         * Unlike primitive data types in Java (such as int or long), which have fixed
         * sizes and can only represent numbers within a certain range, BigInteger
         * dynamically allocates memory to accommodate numbers of any size. This makes
         * it suitable for situations where you need to work with extremely large
         * integers that exceed the limits of primitive data types.
         * 
         * 
         * / Performing arithmetic operations
         * BigInteger sum = bigIntA.add(bigIntB);
         * BigInteger product = bigIntA.multiply(bigIntB);
         * BigInteger sqrt = a.sqrt();
         * 
         */

        return sum.toString(2);
    }

    public static void main(String args[]) {
        String str1 = "11";
        String str2 = "1";
        String res = add(str1, str2);
        System.out.println(res);
    }
}
