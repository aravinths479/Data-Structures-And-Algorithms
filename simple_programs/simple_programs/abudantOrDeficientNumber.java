/*
 
The proper divisors of 12 are 1, 2, 3, 4, and 6. The sum of these divisors is 16, which is greater than 12. 
Therefore, 12 is an abundant number.

A deficient number, on the other hand, is a positive integer for which the sum of its proper divisors is less than the number itself.

*/

package simple_programs;

public class abudantOrDeficientNumber {

    // Function to calculate the sum of proper divisors of a number
    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Function to classify a number as abundant or deficient
    public static String classifyNumber(int num) {
        int sum = sumOfDivisors(num);
        if (sum < num) {
            return "Deficient Number";
        } else if (sum > num) {
            return "Abundant Number";
        } else {
            return "Neither Abundant nor Deficient";
        }
    }
    public static void main(String[] args) {
        int n = 28;
        System.out.println(classifyNumber(n));
    }
}