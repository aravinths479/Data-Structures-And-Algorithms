// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].



// int n = digits.length;: Get the length of the input array digits.

// for (int i = n - 1; i >= 0; i--) {: Start iterating through the array digits in reverse order, 
// starting from the least significant digit.

// if (digits[i] < 9) { digits[i]++; return digits; }: Check if the current digit is less than 9. 
// If it is, we can simply add 1 to it, and the addition process is complete. We then return the modified digits array. 
// This step handles cases where no carry is involved.

// digits[i] = 0;: If the current digit is 9, set it to 0, as adding one to 9 results in carrying over to the next digit.

// Continue the loop, moving to the next digit (to the left) and repeating steps 3-4.

// If the loop completes without returning, it means that all digits were 9 and carrying occurred throughout. 
// In this case, create a new array result with a length of n + 1 (since carrying extends the number of digits), 
// set the most significant digit to 1 (as the carry propagated to the leftmost digit), and return the result array.

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;

public class plusOne {
    public static int[] add(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String args[]){
        int digits[] = {1,2,3};
        System.out.println(Arrays.toString(add(digits)));
        
    }
}
