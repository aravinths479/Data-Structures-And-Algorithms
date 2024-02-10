/*

 A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself

Please enter a positive integer:     28
28 is a perfect number.

 */

package simple_programs;

public class perfectNumber {
    public static boolean perfectOrNot(int n) {
        int sum = 0;
        for (int i = 1; i < n / 2; i++) { // n/2 - for unwanted iterations
            if (n % i == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return n == sum ? true : false;
    }

    public static void main(String[] args) {
        int n = 28;
        System.out.println(perfectOrNot(n));

    }
}
